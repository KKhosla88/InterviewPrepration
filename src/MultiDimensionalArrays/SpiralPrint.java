package MultiDimensionalArrays;
import java.util.Scanner;

public class SpiralPrint {
    public static void spiralPrint(int[][] arr) {
     int rowStart = 0;
     int rowEnd = arr[0].length - 1;
     int colStart = 0;
     int colEnd = arr.length - 1;
     int count = 0;

     while (count < arr.length*arr[0].length ){
         for(int i = rowStart; i <= rowEnd ; i++){
             System.out.print(arr[colStart][i] + " ");
             count++;
         }
         for (int i = colStart + 1;i <= colEnd;i++){
             System.out.print(arr[i][rowEnd] + " ");
             count++;
         }
         for (int i = rowEnd - 1; i >= rowStart ; i--){
             System.out.print(arr[colEnd][i] + " ");
             count++;
         }
         for (int i = colEnd - 1 ; i >= colStart + 1 ; i--){
             System.out.print(arr[i][rowStart] + " ");
             count++;
         }
         rowStart++;
         rowEnd--;
         colStart++;
         colEnd--;
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int count  = row*col;
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row;i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        spiralPrint(arr);

    }

}
