package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MaxFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int max = 0;
        int num =0;
        for(int i =0 ; i < arr.length;i++){
            if(!integerHashMap.containsKey(arr[i])){
                integerHashMap.put(arr[i],1);
                ar.add(arr[i]);
            }
            else {
                integerHashMap.put(arr[i],integerHashMap.get(arr[i]) + 1);
            }
        }
        for (int i = 0 ; i < ar.size();i++){
            if(integerHashMap.get(ar.get(i)) > max){
                max = integerHashMap.get(ar.get(i));
                num = ar.get(i);
            }

        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arr = new int[size];

        for(int i = 0 ; i < size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxFrequencyNumber(arr));
    }
}
