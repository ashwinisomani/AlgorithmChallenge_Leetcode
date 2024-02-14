package BinaryTree.Day2Challenge;

import BinaryTree.TreeNode;

public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);


        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result =  SubTreeOfAnotherTree.isSubtree(root,subRoot);
        System.out.println(result);
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if(isSame(root,subRoot)) return true;
        return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);

    }

    public static boolean isSame(TreeNode root , TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;

        if(root.val != subRoot.val) return false;

        return isSame(root.left , subRoot.left) && isSame(root.right , subRoot.right);
    }
}

