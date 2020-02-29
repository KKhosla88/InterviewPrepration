package Trees;
import java.util.Scanner;

public class LevelWiseIO {
    public static TreeNode<Integer> takeInput() throws QueueEmptyException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter root Data");
        int rootData = scanner.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
//            System.out.println("Enter Child Nodes of " + frontNode.data);
            int noOfFrontNodeChildren = scanner.nextInt();

            for(int i = 0 ; i < noOfFrontNodeChildren;i++){
//                System.out.println("Enter " + (int)(i + 1) + " no child of " + frontNode.data);
                TreeNode<Integer> child = new TreeNode<>(scanner.nextInt());
                frontNode.children.add(child);
                pendingNodes.enqueue(child);
            }
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) throws QueueEmptyException{
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        System.out.println(root.data);
        while (!pendingNodes.isEmpty()){
            TreeNode<Integer> rootNode = pendingNodes.dequeue();
            System.out.println();
            for (int i = 0 ; i < rootNode.children.size();i++){
                System.out.print(rootNode.children.get(i).data + " ");
                pendingNodes.enqueue(rootNode.children.get(i));
            }
        }
    }

    public static void main(String[] args) throws QueueEmptyException {
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}
