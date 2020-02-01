package Recurssion.one.Assigment;

import java.util.Scanner;

public class MultiplyRecursively {
    public static int multiplyTwoIntegers(int m,int n){
        return multiplyRecursively(m,n,1);
    }
    public static int multiplyRecursively(int m,int n,int sum){
        if(n == 0){
            return sum * 1;
        }
        return multiplyRecursively(m , n-1,sum * m);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(multiplyTwoIntegers(m,n));
    }
}
