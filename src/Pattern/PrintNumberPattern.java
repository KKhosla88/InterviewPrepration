package Pattern;

import java.util.Scanner;

public class PrintNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int starCount = 1;
        int arr[] = new int[n];
        int count = -2;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (i <= n / 2) {

                    count = count + 2;
                } else if (i == n / 2 + 1) {
                    count = count+1;

                }  else if(i > n/2 + 1){
                    count = count - 2;
                }
                for (int j = 1; j <= n; j++) {

                    System.out.print(count * n + j + " ");
                }

                System.out.println();
            }
        } else {
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i < n / 2 + 1) {

                        count = count + 2;
                    } else if (i == n / 2 + 1) {

                    } else {

                        count = count - 2;

                    }
                    for (int j = 1; j <= n; j++) {

                        System.out.print(count * n + j + " ");
                        System.out.println();
                    }
                }
            }

        }
    }
}
