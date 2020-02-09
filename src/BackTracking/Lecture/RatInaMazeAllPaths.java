package BackTracking.Lecture;

import java.util.Scanner;

public class RatInaMazeAllPaths {
    public static void check(int maze[][]){
        int[][] path = new int[maze.length][maze[0].length];
        printAllPath(maze,0,0,path);
    }
    private static void printAllPath(int [][] maze,int i ,int j,int [][] path){
        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] ==1){
            return;
        }
        path[i][j] = 1;
        if (i == maze.length - 1 && j == maze.length - 1){
            for(int r = 0 ; r < maze.length ; r++){
                for(int c = 0 ; c < maze[0].length ; c++){
                    System.out.print(path[r][c] + " ");
                }
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        printAllPath(maze,i-1,j,path);
        printAllPath(maze,i,j + 1,path);
        printAllPath(maze,i+1,j,path);
        printAllPath(maze,i,j - 1,path);
        path[i][j] = 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] maze = new int[size][size];

        for(int i = 0 ; i < maze.length ; i ++){
            for(int j = 0 ; j < maze[0].length ; j++){
                maze[i][j] = scanner.nextInt();
            }
        }
        check(maze);
    }
}
