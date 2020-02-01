package Recurssion.one.Assigment;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        return sumOfDigit(n,0);
    }
    public static int sumOfDigit(int n,int sum){
        if(n < 10){
            return sum + n;
        }
        sum = sum + n%10;
        return sumOfDigit(n/10,sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
