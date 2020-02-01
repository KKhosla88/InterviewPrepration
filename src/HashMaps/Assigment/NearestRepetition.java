package HashMaps.Assigment;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NearestRepetition {
    public static int nearestRepetition(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0 ; i  < arr.length ; i++){
            hm.put(arr[i],i);
        }

        for (int i = 0 ; i  < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                    if(hm.get(arr[i] ) != i) {
                        pq.add(hm.get(arr[i]) - i);
                }
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];

        for(int i = 0;i < arr.length ;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(nearestRepetition(arr));
    }
}
