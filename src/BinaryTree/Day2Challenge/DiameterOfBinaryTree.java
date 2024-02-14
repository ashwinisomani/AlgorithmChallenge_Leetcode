package BinaryTree.Day2Challenge;

import BinaryTree.TreeNode;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.left.left = new TreeNode(3);
      root.left.right = new TreeNode(4);
      root.left.left.left = new TreeNode(5);
      root.left.right.right = new TreeNode(6);

      int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);
      System.out.println(result);

    }

    static int max = 0 ;
    public static int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }

    public static int diameter(TreeNode root){
        if(root == null) return 0;

        int left  = diameter(root.left);
        int right = diameter(root.right);

        max = Math.max(max , left+right);

        return 1 + Math.max(left , right);
    }

}
