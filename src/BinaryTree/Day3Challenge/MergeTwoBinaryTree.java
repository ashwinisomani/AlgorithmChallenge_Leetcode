package BinaryTree.Day3Challenge;

import BinaryTree.TreeNode;

public class MergeTwoBinaryTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        TreeNode root = MergeTwoBinaryTree.mergeTrees(root1,root2);
        System.out.println(root);


    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null ) return root2;
        if(root2 == null ) return root1;

        int x = root1.val != 0 ? root1.val : 0;
        int y = root2.val != 0 ? root2.val : 0;

        TreeNode newNode = new TreeNode(x+y);
        newNode.left  = mergeTrees(root1.left  , root2.left);
        newNode.right = mergeTrees(root1.right , root2.right);

        return newNode;
    }
}

