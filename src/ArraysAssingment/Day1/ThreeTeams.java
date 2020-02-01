package ArraysAssingment.Day1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ThreeTeams {
    public static int ThreeTeams(int arr[], final int TeamSize) {

        int sum = 0;
        int start = 0;
        int end = TeamSize - 1;
        System.out.println(arr.length);
        System.out.println(TeamSize);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < TeamSize; i++) {
            sum = sum + arr[i];

        }
        pq.add(sum);

        while (end < arr.length - 1) {
            sum = sum - arr[start];
            end++;
            start++;
            sum = sum + arr[end];
            pq.add(sum);
        }
        for (int i = 0; i < pq.size(); i++) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int TeamSize = scanner.nextInt();
        int ans = ThreeTeams(arr, TeamSize);
        System.out.println(ans);

    }
}
