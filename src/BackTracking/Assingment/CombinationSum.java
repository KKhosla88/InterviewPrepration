package BackTracking.Assingment;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum {
    private static void sum(int[] arr,int n){
        ArrayList<Integer> al = new ArrayList<>();
        helper(arr,al,0,n);
    }
    private static void helper(int[] arr, ArrayList<Integer> subArray, int count, int sum){
        if(sum(subArray) == sum){
           print(subArray);
           subArray.remove(subArray.size() - 1);
        }
        for (int i = 0 ; i < arr.length ; i++) {
            subArray.add(arr[i]);
            helper(arr, subArray, count + 1, sum);
        }
    }
    private static int sum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }
    private static void print(ArrayList<Integer> arr){
        for (int i = 0 ; i < arr.size(); i++){
            System.out.println(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }

        int sum = scanner.nextInt();
        sum(arr,sum);

    }
}
