package Trees;

import java.util.Scanner;

public class RecursiveInputOutput {
    public static TreeNode<Integer> takeInput(Scanner scanner){
        System.out.println("Enter next Node Data/Root Data : ");
        int n = scanner.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("For Root Node " + root.data + " Enter No Of child ");
        int noOfChild = scanner.nextInt();
        for(int i = 0 ; i < noOfChild ; i++){
            TreeNode<Integer> child = takeInput(scanner);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ": ";
        for (int i = 0; i < root.children.size(); i++) {
            if (i < root.children.size() - 1) {
                s = s.concat(root.children.get(i).data + ", ");
            } else {
                s = s.concat(root.children.get(i).data + "");
            }
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode<Integer> tree = takeInput(scanner);
        print(tree);
    }
}
