package MultiDimensionalArrays;

import java.util.HashMap;
import java.util.Scanner;

public class LargestRowColumn {
    public static void findLargest(int[][] arr){
        int rowSum = 0;
        HashMap<Integer, Integer> rowHm = new HashMap<>();
        for(int i = 0 ; i < arr.length;i++){
            int sum = 0;
            for(int j = 0; j < arr[0].length;j++){
                sum += arr[i][j];
//                System.out.println("row " + i + "col " + j);
            }

            if(sum > rowSum){
                rowSum = sum;
                if(!rowHm.isEmpty()){
                    rowHm.clear();
                    rowHm.put(rowSum,i);
                }
                else{
                    rowHm.put(rowSum,i);
                }
            }
//            System.out.println("rowSum is " + rowSum + " Sum is " + sum);
        }

        int colSum = 0;
        HashMap<Integer, Integer> colHm = new HashMap<>();

        for(int j = 0; j < arr[0].length;j++){
            int sum = 0;
            for(int i = 0 ; i < arr.length;i++) {
                sum += arr[i][j];
//                System.out.println("row " + i + "col " + j) ;
            }
//            System.out.println("sum is " + sum );
            if (sum > colSum){
                colSum = sum;
                if (!colHm.isEmpty()){
                    colHm.clear();
                    colHm.put(colSum,j);
                }
                else {
                    colHm.put(colSum,j);
                }
//                System.out.println("colSum is " + colSum + " sum is " + sum);
            }
        }

        if(rowSum > colSum){
            System.out.println("row" + " "  + rowHm.get(rowSum) +" " + rowSum);
        }
        else {
            System.out.println("column" + " " + colHm.get(colSum) + " " + colSum);
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
        findLargest(arr);
    }
}
