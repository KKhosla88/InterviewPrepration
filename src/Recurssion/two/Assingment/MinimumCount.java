package Recurssion.two.Assingment;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumCount {
    public static int minimumCount(int n){

        return minimumCount(n,1,0);

    }
    public static int minimumCount(int n, int square, int count){
        if(n <= 1 ){
            count = count + 1;
            return count;
        }

        return minimumCount(n - (int)(Math.pow(square,2)),square + 1,count + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(minimumCount(n));
    }
}
