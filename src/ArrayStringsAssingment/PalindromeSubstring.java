package ArrayStringsAssingment;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeSubstring {
    public static int countPalindromeSubstring(String str) {
        Stack<Character> characterStack = new Stack<>();
        int count = 0;
        for(int i = 0 ; i < str.length();i++){
            if (characterStack.isEmpty()){
                characterStack.push(str.charAt(i));
            }
            else if(characterStack.peek() != str.charAt(i)){
                characterStack.push(str.charAt(i));
            }
            else {
                characterStack.pop();
                count++;
            }
        }

        if(!checkPalindrome(str))
        return str.length() + count;

        else
            return str.length()  + count+ 1;

    }
    public static boolean checkPalindrome(String str){
        for (int i = 0; i < str.length()/2;i++){
            if(str.charAt(i)  != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(countPalindromeSubstring(str));
    }
}
