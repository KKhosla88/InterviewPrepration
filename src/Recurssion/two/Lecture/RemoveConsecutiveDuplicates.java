package Recurssion.two.Lecture;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        return removeConsecutiveDuplicates(str,0,1);
    }

    public static String removeConsecutiveDuplicates(String str,int start,int end){
        boolean check = str.charAt(start) == str.charAt(end);
        if(end == str.length() - 1){
           if(check){
               str = str.substring(0,end);
           }
           return str;

        }
        if (check){
            str = str.substring(0,start) + str.substring(end);
            return removeConsecutiveDuplicates(str,start,end);
        }
        return removeConsecutiveDuplicates(str,start + 1,end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
