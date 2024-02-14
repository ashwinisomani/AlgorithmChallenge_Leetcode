package BinaryTree.Day2Challenge;

import BinaryTree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = MaximumDepthOfBinaryTree.maxDepth(root);
        System.out.println(result);


    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null){
            return 1 + maxDepth(root.right);
        }

        if(root.right == null){
            return 1 + maxDepth(root.left);
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

//Time Complexity  = O(N)
//Space Complexity = O(N)
//       Best Case = O(logN) , the tree is completely balanced
