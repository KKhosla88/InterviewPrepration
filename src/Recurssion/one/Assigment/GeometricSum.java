package Recurssion.one.Assigment;

import java.util.Scanner;

public class GeometricSum {
    public static double geometricSum(int n){
        return geometricSum(n,0.00);
    }
    public static double geometricSum(int n,Double sum){
        if(n == 0){
            return sum + 1.00;
        }
        sum = sum + 1/Math.pow(2,n);
        return geometricSum(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(geometricSum(n));
    }
}
