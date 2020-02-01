package Recurssion.two.Assingment;
import java.util.Scanner;

public class ConvertStringToInteger {
    public static int convertStringToInteger(String str){
       return convertStringToInteger(str,0,(int)(Math.pow(10,str.length() - 1)),0);
    }
    public static int convertStringToInteger(String str,int number,int multiplier,int i){
        if(i == str.length() - 1){
            return number + str.charAt(i) - 48;
        }
        return convertStringToInteger(str,number + (str.charAt(i) - 48) * multiplier,multiplier/10,i + 1 );

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(convertStringToInteger(str));
    }
}
