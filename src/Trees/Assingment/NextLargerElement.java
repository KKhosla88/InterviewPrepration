package Trees.Assingment;
import Trees.LevelWiseIO;
import Trees.QueueEmptyException;
import Trees.TreeNode;

import java.util.Arrays;
import java.util.Scanner;

public class NextLargerElement {
    public static int nextLargerNum(TreeNode<Integer> root,int n){
        int temp = 0;
        int ans = 0;
        for(int i = 0; i < root.children.size() ;i++){
        }
        for (int i = 0 ; i < root.children.size();i++){

        }
        return 0;
    }
    public static int minDiff(int i ,int j){
        if (i - j > 0){
            return i - j;
        }
        else {
            return j - i;
        }
    }

    public static void main(String[] args) throws QueueEmptyException {
        Scanner scanner = new Scanner(System.in);
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(nextLargerNum(root,scanner.nextInt()));
    }
}
