package ArraysAssingment.Day1;

import java.util.Scanner;

public class largestSumSubArrays{
    public static int largestSumSubArrays(int arr[],int windowSize) {
        int finalSum = 0;
        for(int j = 0; j < arr.length - windowSize; j++) {
            int start = j;
            int end = start + windowSize - 1;
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = sum + arr[i];
            }
            int tempSum = sum;

            while (end < arr.length - 1) {
                end++;
                tempSum = tempSum + arr[end];
                if (tempSum > sum) {
                    sum = tempSum;
                }
            }
            if(sum > finalSum){
                finalSum = sum;
            }
        }
        return finalSum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size;i++){
            arr[i] = scanner.nextInt();
        }
        int windowSize = scanner.nextInt();
        System.out.println(largestSumSubArrays(arr,windowSize));
    }
}
