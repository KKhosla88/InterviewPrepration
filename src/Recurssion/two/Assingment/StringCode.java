package Recurssion.two.Assingment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StringCode {
    public static  String[] getCode(String input){
        // Write your code here
        int i = 0;
        String[] ans = {" "};
        Set<String> str = decode("", input );
        Iterator<String> itr = str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            i++;
        }
        return  ans;
    }
    public static Set<String> decode(String prefix, String code) {
        Set<String> set = new HashSet<String>();
        if (code.length() == 0) {
            set.add(prefix);
            return set;
        }

        if (code.charAt(0) == '0')
            return set;

        set.addAll(decode(prefix + (char) (code.charAt(0) - '1' + 'a'),
                code.substring(1)));
        if (code.length() >= 2 && code.charAt(0) == '1') {
            set.addAll(decode(
                    prefix + (char) (10 + code.charAt(1) - '1' + 'a'),
                    code.substring(2)));
        }
        if (code.length() >= 2 && code.charAt(0) == '2'
                && code.charAt(1) <= '6') {
            set.addAll(decode(
                    prefix + (char) (20 + code.charAt(1) - '1' + 'a'),
                    code.substring(2)));
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ans[] = getCode(str);

        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }

}
