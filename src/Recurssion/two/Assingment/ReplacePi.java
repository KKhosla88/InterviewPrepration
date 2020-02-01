package Recurssion.two.Assingment;

import java.util.Scanner;

public class ReplacePi {
    public static String replacePi (String str){
        return replacePi(str,0,1);
    }
    public static String replacePi (String str,int start,int end){
        boolean check = str.charAt(start) == 'p' && str.charAt(end) == 'i';
        if(end == str.length() - 1){
            if(check){
                return str.substring(0,start) + "3.14";
            }
            else {
                return str;
            }
        }
        else {
            if (check) {
                str = str.substring(0, start) + "3.14" + str.substring(end + 1);

            }
            else {

            }
        }
        return replacePi(str,start + 1,end + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(replacePi(str));
    }
}
