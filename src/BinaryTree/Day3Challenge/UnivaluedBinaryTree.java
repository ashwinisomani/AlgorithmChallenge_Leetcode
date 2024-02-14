package BinaryTree.Day3Challenge;

import BinaryTree.TreeNode;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
       root.left = new TreeNode(1);
       root.right = new TreeNode(1);
       root.left.left = new TreeNode(1);
       root.left.right = new TreeNode(1);

       boolean result = UnivaluedBinaryTree.isUnivalTree(root);
       System.out.println(result);
    }

    public static boolean isUnivalTree(TreeNode root){
    return isUnival(root, root.val);
    }

    public static boolean isUnival(TreeNode root , int val){
        if(root == null) return true;

        if(root.val != val) return false;

        return isUnival(root.left, val) && isUnival(root.right , val);

    }
}

//Time Complexity: O(N), where N is the number of nodes in the given tree.
//Space Complexity: O(N).