package BinaryTree.Day7Challenge;

import BinaryTree.TreeNode;

public class LowestCommonAncestorOfBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p  = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        TreeNode result = LowestCommonAncestorOfBinarySearchTree.lowestCommonAncestor(root,p,q);
        if (result != null) {
            System.out.println(result.val);
        } else {
            System.out.println("No common ancestor found.");
         }
       }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        TreeNode left  = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left == null){
            return right;
        }

        else if(right == null){
            return left;
        }
        else{
            return root;
        }
    }
}




