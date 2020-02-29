package StacksAndQueues.lecture;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    private static boolean check(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if (c == '{' || c == '}' || c == '(' || c == ')' || c == '[' || c == ']') {
                if (st.isEmpty()){
                    st.push(c);
                }
                else if(c == '}' || c == ']' || c == ')'){
                    if((c == '}') && (st.peek() == '{')){
                        st.pop();
                    }
                    else if((c == ')') && (st.peek() == '(')){
                        st.pop();
                    }
                    else if((c == ']') && (st.peek() == '[')){
                        st.pop();
                    }
                    else {
                        st.push(c);
                    }
                }
                else {
                    st.push(c);
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(check(str));
    }
}
