package HashMaps.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SetsWithKDifference {
    public static void setsWithKDifference(int[] arr,int k){
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i =0; i < arr.length ; i++){
            if(integerHashMap.containsKey(arr[i])){
                integerHashMap.put(arr[i],integerHashMap.get(arr[i]) + 1);
            }
            else if(!integerHashMap.containsKey(arr[i])) {
                integerHashMap.put(arr[i],1);
                if(arr[i] > 0){
                    ar.add(arr[i]);
                }
            }
            else if(integerHashMap.isEmpty()){
                integerHashMap.put(arr[i],1);
                if(arr[i] > 0){
                    ar.add(arr[i]);
                }
            }
        }

        Collections.sort(ar);

        for(int i = 0; i < ar.size();i++) {
            if (integerHashMap.containsKey(k - ar.get(i))) {
                for (int j = 0; j < integerHashMap.get(ar.get(i)) * integerHashMap.get(k-ar.get(i)); j++) {
                    System.out.print(k - ar.get(i) + " " + ar.get(i) + "   ");
                }
                integerHashMap.remove(ar.get(i));
                integerHashMap.remove(k - ar.get(i));
            }
            else if (integerHashMap.containsKey(ar.get(i) - k)) {
                for (int j = 0; j < integerHashMap.get(ar.get(i)) * integerHashMap.get(ar.get(i) - k); j++) {
                    System.out.print(ar.get(i) - k + " " + ar.get(i) + "   ");
                }
                integerHashMap.remove(ar.get(i));
                integerHashMap.remove(ar.get(i) - k);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        setsWithKDifference(arr,k);
    }
}
