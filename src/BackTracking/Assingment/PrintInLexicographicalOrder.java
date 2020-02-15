package BackTracking.Assingment;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrintInLexicographicalOrder {
   public static void lexicographicalOrder(int n) {
        double num = n;
        HashMap<Double, Integer> hm = new HashMap<>();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (double i = 1 ; i <= num ; i++){
            int count = 0;
            while (i > 1.00) {
                i = i / 10.00;
                count++;
            }
            System.out.println((i) + " " +(count));
            hm.put(i,count);
            pq.add(i);
        }

        while (!pq.isEmpty()){
            double i = pq.poll();
            int mul = hm.get(i);
            System.out.println((int)(i*(int)(Math.pow(10,mul))));
        }

    }

    public static void lexicographicalOrder(int n,int number){
        if(number > n){
            System.out.println(number);
            return;
        }
        for (int i = 0 ; i <= 9 ; i++){
            for(int j = 0 ; j <= 9 ; j++){
                System.out.println(i*10 + j);
                lexicographicalOrder(n,i*10 + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        lexicographicalOrder(n,0);
    }
}
