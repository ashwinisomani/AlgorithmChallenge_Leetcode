package BinaryTree.Day7Challenge;

import BinaryTree.TreeNode;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean result = ValidateBinarySearchTree.isValidBST(root);
        System.out.println(result);
    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return isValid(root, Long.MIN_VALUE , Long.MAX_VALUE);
    }

    public static boolean isValid(TreeNode root , long min , long max){
        if(root == null){
            return true;
        }

        if(root.val <= min  || root.val >= max){
            return false;
        }

        return isValid(root.left , min , root.val) && isValid(root.right, root.val , max);

    }
}

