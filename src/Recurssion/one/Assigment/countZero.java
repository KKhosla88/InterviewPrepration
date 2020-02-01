package Recurssion.one.Assigment;

import java.util.Scanner;

public class countZero {
    public static int countZerosRec(int input){
        return countZerosRec(input,0);
    }
    public static int countZerosRec(int input,int count){

        if(input < 10){
            return count;
        }
        if(input%10 == 0){
            count++;
        }
        return countZerosRec(input/10,count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        countZerosRec(n);
    }
}
