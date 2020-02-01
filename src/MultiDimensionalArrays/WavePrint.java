package MultiDimensionalArrays;

import java.util.Scanner;

public class WavePrint {
    public static void wavePrint(int arr[][]) {
        for (int j = 0; j < arr[0].length ; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length ; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int i = arr.length - 1; i >= 0 ; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row;i++){
            for(int j = 0; j < col;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        wavePrint(arr);

    }
}
