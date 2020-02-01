package HashMaps.Assigment;

import java.util.HashMap;
import java.util.Scanner;

public class PairsWithDifferenceK {
    public static void pairsWithDifferenceK(int[] arr, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            if(hm.isEmpty()){
                hm.put(arr[i],1);
            }
            else if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }
            else if (!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
        } //putting array in hash
        System.out.println(hm.get(4));
       for(int i = 0 ; i< arr.length ; i++){
           if(hm.containsKey(k - arr[i])){
               System.out.println("executed k-arr[i]");
               for (int j = 0;j < hm.get(k - arr[i]);j++){
                   System.out.println(arr[i] + " " + (k - arr[i]));
               }
               hm.put(arr[i] , hm.get(arr[i]) - 1);
               if (hm.get(arr[i]) <= 0){
                   hm.remove(arr[i]);
               }
           }
           if(hm.containsKey(arr[i] - k)){

               for (int j = 0;j < hm.get(arr[i] - k);j++){
                   System.out.println("executed");
                   System.out.println(arr[i] + " " + (arr[i] - k));
               }
               hm.put(arr[i] , hm.get(arr[i]) - 1);
               if (hm.get(arr[i]) <= 0){
                   hm.remove(arr[i]);
               }
           }
       }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int siz = scanner.nextInt();
        int[] arr = new int[siz];

        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        pairsWithDifferenceK(arr,k);

    }
}
