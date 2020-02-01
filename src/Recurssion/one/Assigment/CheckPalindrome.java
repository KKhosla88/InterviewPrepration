package Recurssion.one.Assigment;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
        return checkPalindrome(str,0);
    }
    public static boolean checkPalindrome(String str,int index){
        if(index == str.length()/2){
            return true;
        }
        if(str.charAt(index) != str.charAt(str.length() - index -1)){
            return false;
        }
        return checkPalindrome(str,index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(checkPalindrome(str));
    }
}
