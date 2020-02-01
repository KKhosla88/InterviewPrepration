package ArraysAssingment.Day3;

import java.util.HashMap;
import java.util.Scanner;

public class SearchSortedArray {
    public static boolean searchSortedArray(int arr[],int searchNumber){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length;i++){
            if(hm.containsKey(searchNumber - arr[i])){
                return true;
            }
            else{
                if (hm.containsKey(arr[i])){
                    hm.put(arr[i],hm.get(arr[i]) + 1);
                }
                else {
                    hm.put(arr[i],1);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int searchNumber = scanner.nextInt();
        System.out.println(searchSortedArray(arr,searchNumber));
    }
}
