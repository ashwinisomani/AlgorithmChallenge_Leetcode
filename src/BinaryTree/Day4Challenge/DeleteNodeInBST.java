package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

public class DeleteNodeInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);;
        root.right.right = new TreeNode(7);

        int key  = 3;

        TreeNode result = DeleteNodeInBST.deleteNode(root , key);
        System.out.println(result);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key > root.val)
            root.right = deleteNode(root.right, key);

        else if (key < root.val)
            root.left = deleteNode(root.left, key);

        else {
            // the node is a leaf
            if (root.left == null && root.right == null) root = null;

                // the node is not a leaf and has a right child
            else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            // the node is not a leaf, has no right child, and has a left child
            else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    public static int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    public static int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }
}
