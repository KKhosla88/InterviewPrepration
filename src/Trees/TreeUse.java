package Trees;

import org.w3c.dom.css.Rect;

import java.sql.ResultSet;

public class TreeUse {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node5 = new TreeNode<>(5);
        TreeNode<Integer> node6 = new TreeNode<>(6);

        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node3.children.add(node6);
        node3.children.add(node5);
        RecursiveInputOutput.print(root);
    }
}
