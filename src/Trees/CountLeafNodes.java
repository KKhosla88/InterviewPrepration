package Trees;

public class CountLeafNodes {
    private static int countLeaf(TreeNode<Integer> root){
        int count = 0;
        if(root.children.size() == 0){
            count++;
        }
        for(int i = 0 ; i < root.children.size() ; i++){
            count = count + countLeaf(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) throws QueueEmptyException{
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        System.out.println(countLeaf(root));
    }
}
