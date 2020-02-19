package WeeklyTests.WeeklyTest6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NextHappyNumber {
    private static int happyNumber(int n){
        n = n + 1;
        while (!check(n)){
            n++;
        }
        return n;
    }
    private static boolean check(int num){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);

        while (num != 1){
            hm.put(num,1);
            ArrayList<Integer> al = new ArrayList<>();
            while (num > 1){
                int temp = num%10;
                al.add(temp);
                num = num / 10;
            }
            for (int i = 0 ; i < al.size() ; i++){
                num = num + (int)(Math.pow(al.get(i),2));
            }
            if (hm.containsKey(num)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(happyNumber(i));
    }
}
