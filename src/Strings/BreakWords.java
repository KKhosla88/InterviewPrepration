package Strings;

import java.util.Scanner;

public class BreakWords {
    public static String breakWords(String str){
        String ans = "";
        int start = 0;
        int end = 0;
        int count = 0;

        for(int i = 0 ; i < str.length() - 1 ; i++){
            if(str.charAt(end) != ' '){
                count++;
                end++;
            }
            else{
                if(count % 2 == 0 && count >= 3){
                    for(int j = start; j < (end - start)/2;j++){
                        ans = ans + str.charAt(j);
                    }
                    ans = ans + " ";
                    for(int j = (end - start)/2 + 1; j <= end; j++){
                        ans = ans + str.charAt(j);
                    }
                    ans = ans + " ";
                }
                else{
                    for(int j = start; j < (end);j++){
                        ans = ans + str.charAt(j);
                    }
                    ans = ans + " ";
                }
                start = end+1;
                end++;
                count = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(breakWords(str));
    }
}
