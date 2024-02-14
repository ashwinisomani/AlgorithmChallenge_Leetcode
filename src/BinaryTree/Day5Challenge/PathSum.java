package BinaryTree.Day5Challenge;

import BinaryTree.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        int targetSum = 18;
        boolean result = PathSum.hasPathSum(root,targetSum);
        System.out.println(result);

    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        targetSum -= root.val;
        if ((root.left == null) && (root.right == null)) // if there is a root to leaf path exist
            if(targetSum == 0) return true;

        return hasPathSum(root.left , targetSum) || hasPathSum(root.right , targetSum);

    }
}

