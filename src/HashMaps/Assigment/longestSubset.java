package HashMaps.Assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class longestSubset {
    public static int longestSubset(int arr[]) {
        int countOne  = 0;
        int countZero = 0;
        int length = 0;
        int start = 0;
        int end = 0;

        for(int i = 0;i < arr.length;i++){
            if(countOne == countZero){
                length = end - start;
            }

        }

        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(longestSubset(arr));
    }
}
//20
//1 0 1 0 0 1 0 1 1 0 1 1 1 0 1 0 0 1 0 1