package Recurssion.two.Assingment;

import java.util.Scanner;

public class StaircaseCount {
    public static int staircase(int noOfStairs ) {
        if (noOfStairs == 1 || noOfStairs == 0 ){
            return 1;
        }
        else if(noOfStairs == 2){
            return 2;
        }
        return staircase(noOfStairs - 3) + staircase(noOfStairs - 2 ) + staircase(noOfStairs - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfStairs = scanner.nextInt();
        System.out.println(staircase(noOfStairs));
    }
}
