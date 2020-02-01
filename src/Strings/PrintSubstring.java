package Strings;

import java.util.Scanner;

public class PrintSubstring{
    public static void printSubstring(String str){
        for(int i = 0 ; i < str.length(); i++) {
            int start = i;
            int end = start;
            String temp = " ";

            while (end < str.length()){
                temp = temp + str.charAt(end);
                System.out.println(temp);
                end++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printSubstring(str);
    }
}
