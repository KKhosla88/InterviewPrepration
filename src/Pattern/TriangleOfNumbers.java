package Pattern;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row,col,spaces;
        spaces = n*2;
        for(row = 1;row<=n;row++){
            spaces = spaces - 2;
            for(col = 1;col<=row+n-1;col++){
                if(row + col <= n){
                    System.out.print(" ");
                }
                else {
                    if (col <= n)
                        System.out.print(2 * row + col - n - 1);
                    else {
                        if (2 * row + n - col - 1 == 0)
                            System.out.print(" ");
                        else {
                            System.out.print(2 * row + n - col - 1);
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
