package Recurssion.two.Lecture;

import java.util.Scanner;

public class RemoveCharacters {
    public static String replaceCharacters(String str,char replace,char toBeReplaced){
        char arr[] = new char[str.length()];
        for (int i = 0 ; i < str.length() ; i++){
            arr[i] = str.charAt(i);
        }
        replaceCharacters(arr,0,replace,toBeReplaced);
        String ans = "";
        for (int i = 0 ; i < str.length() ; i++){
            ans = ans + arr[i];
        }
        return ans;
    }

    public static void replaceCharacters(char[] str,int i,char replace,char toBeReplaced){
        if(i == str.length - 1){
            if (str[i] == replace){
                str[i] = toBeReplaced;
            }
            return;
        }
        if (str[i] == replace){
            str[i] = toBeReplaced;
        }
        replaceCharacters(str,i+1,replace,toBeReplaced);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char replace = scanner.next().charAt(0);
        char toBeReplaced = scanner.next().charAt(0);
        System.out.println(replaceCharacters(str,replace,toBeReplaced));
    }
}
