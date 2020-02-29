package Trees.Assingment;
import Trees.LevelWiseIO;
import Trees.QueueEmptyException;
import Trees.TreeNode;

public class MaxSumRCh {
    private static TreeNode<Integer> maxSum(TreeNode<Integer> root){
        TreeNode<Integer> ans = root;
        for(int i = 0; i < root.children.size() ; i++){
            if (sum(ans) < sum(root.children.get(i))){
                ans = root.children.get(i);
            }
        }
        return ans;
    }
    private static int sum(TreeNode<Integer> root){
        int sum = root.data;
        for(int i = 0; i < root.children.size() ; i++){
            sum = sum + root.children.get(i).data;
        }
        return sum;
    }

    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(maxSum(root).data);
    }
}
