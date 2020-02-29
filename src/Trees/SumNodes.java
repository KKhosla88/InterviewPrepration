package Trees;

public class SumNodes {
    public static int sumOfAllNode(TreeNode<Integer> root,int count){
        return 0;
    }
    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(sumOfAllNode(root,0));
    }
}
