package Trees;

public class NoOfNodes {
    public static int noOfNodes(TreeNode<Integer> root){
        int count = 1;
        for (int i = 0 ; i < root.children.size() ; i++){
            count += noOfNodes(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(noOfNodes(root));
    }
}
