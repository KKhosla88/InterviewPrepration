package HashMaps.Assigment;

import java.util.HashMap;
import java.util.Scanner;

public class MakeStringAnagram {
    public static int makeStringAnagram(String s1,String s2) {
        HashMap<Character, Integer> s1Hm = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < s1.length() ;i++){
            if(s1Hm.containsKey(s1.charAt(i))){
                s1Hm.put(s1.charAt(i) , s1Hm.get(s1.charAt(i))+ 1);
            }
            else {
                s1Hm.put(s1.charAt(i) , 1);
            }
        }   //To insert s1 in hashMap
        for(int i = 0; i<s2.length() ; i++){
            if(s1Hm.containsKey(s2.charAt(i))){
               s1Hm.put(s2.charAt(i),s1Hm.get(s2.charAt(i)) - 1);
                if(s1Hm.get(s2.charAt(i)) <= 0){
                    s1Hm.remove(s2.charAt(i));
                }
            }
            else {
                count++;
            }
        }
        for(char i : s1Hm.keySet()){
            count = count + s1Hm.get(i);
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(makeStringAnagram(s1,s2));

    }
}
