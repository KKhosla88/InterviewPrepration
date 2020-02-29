package Trees;

import java.util.Stack;

public class PostOrder {
    private static void print(TreeNode<Integer> root){
        Stack<TreeNode<Integer>> st = new Stack<>();
        st.push(root);
        while (st.peek().children.size() != 0){
            for (int i = 0 ; i < st.peek().children.size() ; i++){
                st.push(st.peek().children.get(i));
            }
        }
        while (!st.isEmpty()){
            TreeNode<Integer> newNode = st.pop();
            for (int i = 0 ; i < newNode.children.size() ; i++){
                System.out.print(newNode.children.get(i).data + " ");
            }
        }
        System.out.print(root.data);
    }

    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = LevelWiseIO.takeInput();
        print(root);
    }
}
