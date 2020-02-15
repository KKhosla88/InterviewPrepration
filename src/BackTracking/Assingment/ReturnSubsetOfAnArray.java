package BackTracking.Assingment;

import java.util.Scanner;

public class ReturnSubsetOfAnArray {
    public static int[][] subsets(int[] input) {
        int[][] ans = new int[0][0];
        int[] subArray = new int[input.length];
        helper(input,subArray,0);
        return ans;
    }
    private static void helper(int[] arr,int[] subArray,int count){
        if(count == arr.length){
            if (subArray.length == 0){

            }
            print(subArray);
            System.out.println();
            return;
        }
        subArray[count] = 0;
        helper(arr,subArray,count+1);
        subArray[count] = arr[count];
        helper(arr,subArray,count + 1);
    }
    private static void print(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        subsets(arr);

    }
}
