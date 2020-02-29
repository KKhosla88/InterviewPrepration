package StacksAndQueues.assingment;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketsReversal {
    private static int minBracket(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ;i++){
            if(st.isEmpty()){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }
                else {
                    st.push(str.charAt(i));
                }
            }
            else {
                st.push(str.charAt(i));
            }
        }
        if (st.size() % 2 == 0){
            return st.size()/2;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(minBracket(s));
    }
}
