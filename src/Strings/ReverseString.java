package Strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> charStack = new Stack<>();
        HashMap<Integer,String> stringHm = new HashMap<>();
        int wordCount = 0;
        String temp = " ";
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i) != ' '){
                temp = temp + str.charAt(i);

//               while (!charStack.isEmpty()){
//                   temp = temp + charStack.pop();
//               }
//               stringHm.put(wordCount,temp);
            }
            else {
                wordCount++;
                stringHm.put(wordCount,temp);
                temp = " ";
            }
        }
        wordCount++;
        stringHm.put(wordCount,temp);

        String ans ="";

        for(int i = wordCount; i > 0 ;i--){
            ans = ans + stringHm.get(i) + " ";
        }

        return ans.substring(0,ans.length() - 1);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < reverseString(str).length() ; i ++){
            System.out.print(reverseString(str).charAt(i));
        }
    }
}
