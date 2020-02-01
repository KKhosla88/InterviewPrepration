package MultiDimensionalArrays;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0 ; i < row;i++){
            int count = 0;
            for(int j = 0; j < col;j++){
                arr[i][j] = scanner.nextInt();
                count = count + arr[i][j];
            }
            System.out.print(count + " ");
        }
    }
}
