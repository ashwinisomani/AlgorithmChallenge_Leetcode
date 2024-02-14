package BinaryTree.Day2Challenge;

import BinaryTree.TreeNode;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result =  MinimumDepthOfBinaryTree.minDepth(root);
        System.out.println(result);
    }

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null){
            return 1 + minDepth(root.right);
        }

        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
