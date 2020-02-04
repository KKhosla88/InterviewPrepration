package Recurssion.two.Assingment;
import java.util.Scanner;

public class InterLeavings {
    public static void interLeavings(String first, String second){
        interLeavings("",first,second);
    }
    public static void interLeavings(String res,String first, String second){
        if(first.length() == 0 && second.length() == 0){
            System.out.println(res);
        }

        if(first.length() > 0){
            interLeavings(res + first.charAt(0) , first.substring(1),second);
        }

        if(second.length() > 0){
            interLeavings(res + second.charAt(0),first, second.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        interLeavings(str1,str2);
    }
}
