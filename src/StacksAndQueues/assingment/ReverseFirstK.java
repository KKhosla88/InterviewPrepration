package StacksAndQueues.assingment;
import java.util.*;

public class ReverseFirstK {
    private static Queue<Integer> reverseElements(Queue<Integer> input,int k){
        int a = input.size();
        Queue<Integer> ans = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        while (input.size() > a - k ){
            int i = input.remove();
            ans.add(i);
        }
//        while (!input.isEmpty()){
//            System.out.print(input.remove() + " ");
//        }
//        System.out.println();
//        System.out.println();

        while (!input.isEmpty()){
            temp.add(input.remove());
        }

        while (!ans.isEmpty()){
            st.push(ans.remove());
        }
        while (!st.isEmpty()){
            input.add(st.pop());
        }

        while (!temp.isEmpty()){
            input.add(temp.remove());
        }

        return input;

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(s.nextInt());
        }
        int k = s.nextInt();
        Queue<Integer> ans = reverseElements(q,k);
        while(!ans.isEmpty()){
            System.out.print(ans.remove() + " ");
        }
    }
}
