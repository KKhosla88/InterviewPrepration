package ArraysAssingment.Day1;

import java.util.Scanner;

public class CountInversion {
    public static int countInversion(int[] arr){
        int count = 0;

        for(int i =0;i<arr.length - 1;i++){
            for (int j = i + 1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i =0; i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(countInversion(arr));
    }
}
