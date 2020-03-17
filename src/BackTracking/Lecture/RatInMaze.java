package BackTracking.Lecture;
import java.util.Scanner;

public class RatInMaze {
    public static boolean check(int maze[][])
    {
        int n=maze.length;

        int[][] path = new int[n][n];
        boolean ans = checkMaze(maze,0,0,path);
        return ans;

    }
    private static boolean checkMaze(int [][] maze,int i ,int j,int [][] path){
        if (i < 0 || i >=n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] ==1){
            return false;
        }

        path[i][j] = 1;
        if (i == maze.length - 1 && j == maze.length - 1){
            return true;
        }

        if (checkMaze(maze,i-1,j,path)){
            return true;
        }
        else if (checkMaze(maze,i,j + 1,path)){
            return true;
        }
        else if (checkMaze(maze,i+1,j,path)){
            return true;
        }
        else if (checkMaze(maze,i,j - 1,path)){
            return true;
        }

        return false;
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

        System.out.println(check(maze));
    }
}
