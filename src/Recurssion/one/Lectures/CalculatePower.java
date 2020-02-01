package Recurssion.one.Lectures;

import java.util.Scanner;

public class CalculatePower {
    public static int calculatePower(int x,int n){
        return calculatePower(n,x,1);
    }
    public static int calculatePower(int n,int x,int ans){
        if(n == 0){
            return  ans;
        }
        ans = ans*x;
        return calculatePower(n - 1,x,ans);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println( calculatePower(x,n));

    }
}
