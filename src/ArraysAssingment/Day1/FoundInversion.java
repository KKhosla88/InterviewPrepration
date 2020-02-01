package ArraysAssingment.Day1;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FoundInversion {
    public static int foundInversion  (int[] arr) {
        int count = 0;
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            pr.add(arr[i]);
        }
        System.out.println(pr.size());
//        for(int i = 0;i<pr.size();i++){
//            System.out.println(pr.poll());
//        }

        for(int i = 0;i<pr.size();i++){
            hm.put(pr.poll(),i);
        }

        for (int i = 0; i < arr.length;i++){
            count += hm.get(arr[i]);
            hm.remove(arr[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(foundInversion(arr));
    }
}

