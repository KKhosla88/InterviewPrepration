package Strings;

import java.util.Scanner;

public class CheckPalindrome {
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
        System.out.println(checkPalindrome(str));
    }
}
