package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

public class InOrderSuccessorInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);


        TreeNode p = new TreeNode(1);

        TreeNode result = InOrderSuccessorInBST.inorderSuccessor(root, p);
        System.out.println(result);
    }

    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;
        while (root != null) {
            if (p.val >= root.val) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
}

//Time Complexity: O(N) since we might end up encountering a skewed tre.
// For a balanced binary search tree, however, the time complexity will be O(logN)
// Space Complexity: O(1) since we don't use recursion or any other data structures for getting our successor or predecessor.