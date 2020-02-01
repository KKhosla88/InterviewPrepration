package ArrayStringsAssingment;

import java.util.Scanner;

public class BreakWords {
    public static String breakWord(String str){
        int start = 0;
        int end = 0;
        int count = 0;

        for(int i = 0 ; i < str.length() ; i++){
//            System.out.print(" for char at " + i + " is " +str.charAt(i) +  " ");
            if(str.charAt(i) == ' '){
                if(count >= 4 && count%2 == 0){
                    addChar(str,'5',(start+end)/2 + 1);
//                    System.out.print("count is " + count + " start is " + start + " end is " + end + " and String is: ");
//                    System.out.print(str);
//                    System.out.println();
                    end = end + 1;
                    start = end;
                }
                else {

                }
            }
            else{
                count++;
                end++;
//                System.out.print("count is " + count + " start is " + start + " end is " + end + " and String is: ");
//                System.out.print(str);
//                System.out.println();

            }
        }
        return str;
    }

    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(addChar(str,'5',2));
        System.out.println(breakWord(str));
    }
}
    //Helloo world good morniing