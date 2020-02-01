package Pattern;

import java.util.Scanner;

public class ArrowPatten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count;
        for (int i = 1 ; i <= n/2 + 1 ; i++){
            for (int j = 1 ; j <= 2*i - 1;j++){
                if(j >= i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n/2 + 2 ; i <= n ; i++){
            for (int j = 1 ; j <= 2*i - 1;j++){
                if(j >= i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
