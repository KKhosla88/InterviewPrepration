package BackTracking.Assingment;

import java.util.Scanner;

public class ReturnSubsetsSumToK {
    public static int[][] subsets(int[] input,int sum) {
        int[][] ans = new int[0][0];
        int[] subArray = new int[input.length];
        helper(input,subArray,0,sum);
        return ans;
    }
    private static void helper(int[] arr,int[] subArray,int count,int sum){
        if(count == arr.length){
            if (sum(subArray) == sum ) {
                print(subArray);
                System.out.println();
            }
            return;
        }
        subArray[count] = 0;
        helper(arr,subArray,count+1,sum);
        subArray[count] = arr[count];
        helper(arr,subArray,count + 1,sum);
    }
    private static void print(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    private static int sum(int[] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        subsets(arr,sum);

    }
}
