package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
    public static ArrayList arrayIntersection(int[] arr1,int[] arr2){
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i <arr1 .length;i++){
                    hm.put(arr1[i],1);
            System.out.println(arr1[i]);
//                }
            }

        for(int i = 0; i <arr2 .length;i++){
                if(hm.containsKey(arr2[i])){
                    ar.add(arr2[i]);
                }
        }
        return ar;
    }

    public static int compare(int[] arr1,int[] arr2) {
        if(arr1.length >= arr2.length){
            return arr1.length;
        }
        else {
            return arr2.length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1Size = scanner.nextInt();
        int arr2Size = scanner.nextInt();

        int[] arr1 = new int[arr1Size];


        for(int i = 0 ; i < arr1Size; i++){
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[arr2Size];
        for(int i = 0 ; i < arr2Size; i++){
            arr2[i] = scanner.nextInt();
        }
        System.out.println(arrayIntersection(arr1,arr2));

    }
}
