package Pattern;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n;i++){
            for (int j = 1; j <= n;j++){
                if (j + i <= n){
                    System.out.print(" ");
                }
                else {
                    System.out.print(i + j - (n - i + 1));
                }
            }
            System.out.println();
        }
    }
}
