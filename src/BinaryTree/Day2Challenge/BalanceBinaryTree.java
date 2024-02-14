package BinaryTree.Day2Challenge;

import BinaryTree.TreeNode;

public class BalanceBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean result = BalanceBinaryTree.isBalanced(root);
        System.out.println(result);

    }
    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public static int height(TreeNode root){
        if(root == null)return 0;

        int left = height(root.left);
        if(left == -1) return -1;

        int right = height(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return 1+ Math.max(left,right);
    }
}