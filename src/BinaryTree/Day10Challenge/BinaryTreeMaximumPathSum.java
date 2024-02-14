package BinaryTree.Day10Challenge;

import BinaryTree.TreeNode;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = BinaryTreeMaximumPathSum.maxPathSum(root);
        System.out.println(result);

    }
    static int max = 0;
    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gainFromSubtree(root);
        return maxSum;
    }

    private static  int maxSum;
    private static int gainFromSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int gainFromLeft = Math.max(gainFromSubtree(root.left), 0);
        int gainFromRight = Math.max(gainFromSubtree(root.right), 0);
        maxSum = Math.max(maxSum, gainFromLeft + gainFromRight + root.val);

        return Math.max(gainFromLeft + root.val, gainFromRight + root.val);
    }
}


