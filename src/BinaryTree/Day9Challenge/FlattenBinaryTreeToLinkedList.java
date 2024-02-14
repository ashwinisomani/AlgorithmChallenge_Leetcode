package BinaryTree.Day9Challenge;

import BinaryTree.TreeNode;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        FlattenBinaryTreeToLinkedList.flatten(root);

    }
    public static void flatten(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        if (root == null) return;
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode  cur = st.peek();
            st.pop();

            if (cur.right != null) {
                st.push(cur.right);
            }
            if (cur.left != null) {
                st.push(cur.left);
            }
            if (!st.isEmpty()) {
                cur.right = st.peek();
            }
            cur.left = null;
        }
    }
}


