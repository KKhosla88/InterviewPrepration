package Recurssion.two.Assingment;

import java.util.Scanner;

public class getSubstrings {
    public static String[] getSubstring(String str){
        if (str.length() == 0 ){
            String ans[] = {" "};
            return ans;
        }
        String smallAns[] = getSubstring(str.substring(1));
        String ans[] = new String[smallAns.length*2];

        for (int i = 0 ; i < smallAns.length ;i++){
            ans[i] = smallAns[i];
        }
        for (int i = smallAns.length; i< smallAns.length*2 ; i++){
            ans[i] = str.charAt(0) + smallAns[i-smallAns.length];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ans[] = getSubstring(str);
        for(int i = 0 ; i < ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
