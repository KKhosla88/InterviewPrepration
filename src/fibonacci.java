import java.util.Scanner;

public class fibonacci {
    public static long nthFibonacci(int input1) {

        return nthFibonacci(input1,0,1,0,0);
    }
    public static long nthFibonacci(int input,int num1,int num2,int num3,int count){
        if(count == input - 1){
            return num1;
        }
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        count++;
        return nthFibonacci(input,num2,num3,num2 + num1,count++);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.print(nthFibonacci(s));
    }
}
