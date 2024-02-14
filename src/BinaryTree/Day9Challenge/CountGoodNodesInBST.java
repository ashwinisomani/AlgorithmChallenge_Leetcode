package BinaryTree.Day9Challenge;

import BinaryTree.TreeNode;

public class CountGoodNodesInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        int result = CountGoodNodesInBST.goodNodes(root);
        System.out.println(result);

    }
    static int count = 0;
    public static int goodNodes(TreeNode root) {
        countGoodNodes(root,  root.val);
        return count;
    }

    public static void countGoodNodes(TreeNode root, int maximum) {
        if(root!=null) {
            if (maximum <= root.val) {
                maximum = root.val;
                count++;
            }
            countGoodNodes(root.left,maximum);
            countGoodNodes(root.right, maximum);
        }
    }
}

