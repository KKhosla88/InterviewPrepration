package ArraysAssingment.Day1;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctNumberInWindow {
    public static void DistinctNumberInWindow(int[] arr, int WindowSize){
        int start = 0;
        int end = WindowSize - 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = start; i <= end; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else {
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }
        }
        while (end < arr.length - 1) {
            System.out.println(hm.size());

            if(!hm.containsKey(arr[end + 1])){
                hm.put(arr[end + 1],1);
            }
            else {
                hm.put(arr[end + 1],hm.get(arr[end + 1]) + 1);
            }

            if(hm.get(arr[start]) == 1){
                hm.remove(arr[start]);
            }
            else {
                hm.put(arr[start],hm.get(arr[start]) - 1);
            }
            end++;
            start++;
        }
        System.out.println(hm.size());


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size;i++){
            arr[i] = scanner.nextInt();
        }
        int WindowSize = scanner.nextInt();
        DistinctNumberInWindow(arr,WindowSize);
    }
}
