package StacksAndQueues.assingment;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    private static int[] stock(int[] arr){
        int largest = 0;
        int count = 1;
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(st.isEmpty()){
                count++;
                largest = arr[i];
                ans[i] = count;
                st.push(arr[i]);
            }
            else if (arr[i] > largest){
                largest = arr[i];
                ans[i] = i + 1;
                st.push(arr[i]);
            }
            else if(arr[i] > st.peek() && arr[i] < largest){
                count++;
                ans[i] = count + 1;
                st.push(arr[i]);
            }
            else if(arr[i] < st.peek()){
                count = 1;
                ans[i] = count;
                st.push(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        int[] ans = stock(arr);

        for (int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
