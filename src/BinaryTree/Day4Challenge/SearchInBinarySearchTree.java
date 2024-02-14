package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

public class SearchInBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        TreeNode result = SearchInBinarySearchTree.searchBST(root , val );
        System.out.println(result);


    }
    public static TreeNode searchBST(TreeNode root, int val) {
    if (root== null)
            return null;
        if (root.val == val)
            return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
   }
}

