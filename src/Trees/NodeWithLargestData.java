package Trees;

import java.util.Queue;

public class NodeWithLargestData {
    private static int nodeWithLargestData(TreeNode<Integer> root){
        int largest = root.data;
        for(int i = 0 ; i < root.children.size();i++){
            if(root.children.get(i).data > largest){
                largest = root.children.get(i).data;
            }
        }
        return largest;
    }

    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(nodeWithLargestData(root));

    }
}
