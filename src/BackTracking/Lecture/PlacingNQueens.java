package BackTracking.Lecture;

import java.util.Scanner;

public class PlacingNQueens {
    private static void printQueens(int n){
       int[][] board = new int[n][n];
       printQueens(0,board,n,0);
    }

    private static boolean printQueens(int count,int[][] board,int N,int ini) {
        if (count >= N) {
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board[0].length; c++) {
                    System.out.print(board[r][c] + " ");
                }
            }
            System.out.println();
            return true;
        }
        boolean res = false;
        for (int a = 0; a < board.length; a++) {
            if (check(count, a, board)) {
                board[count][a] = 1;
                res = printQueens(count + 1, board, N, ini);
                board[count][a] = 0;
            }
        }
        return res;
    }

//    private static void printQueens(int n,int[][] board,int count,int i,int j){
//        if (count == n){
//                for(int r = 0 ; r < board.length ; r++) {
//                    for (int c = 0; c < board[0].length; c++) {
//                        System.out.print(board[r][c] + " ");
//                    }
//                    System.out.println();
//                }
//                return;
//            }
//        for (int a = 0 ; a < n ; a++){
//            if (check(count,a,board)){
//                board[count][a] = 1;
//                i = count;
//                j = a;
//                count++;
//                printQueens(n,board,count, i , j );
//                break;
//            }
//        }
//
//    }

    private static boolean check(int a , int b , int[][] board){
        int i = a;
        int j = b;
        while (i >= 1){
            i--;
            if(board[i][j] == 1){
                return false;
            }
        }
        i = a;
        j = b;
        while (i >= 1  && j < board.length - 1){
            i--;
            j++;
            if(board[i][j] == 1){
                return false;
            }
        }
        i = a;
        j = b;
        while (i >= 1  &&  j >= 1){
            i--;
            j--;
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printQueens(n);
    }
}
