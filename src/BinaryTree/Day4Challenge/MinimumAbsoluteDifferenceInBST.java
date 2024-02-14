package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {

      TreeNode root = new TreeNode(4);
      root.left = new TreeNode(2);
      root.right = new TreeNode(6);
      root.left.left = new TreeNode(1);
      root.left.right = new TreeNode(3);

      int result =  MinimumAbsoluteDifferenceInBST.getMinimumDifference(root);
      System.out.println(result);

      }
    public static int getMinimumDifference(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorderTraversal(root , result);
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i < result.size(); i++) {
            minDistance = Math.abs(Math.min(minDistance, result.get(i) - result.get(i-1)));
        }

        return minDistance;
    }

    public static void inorderTraversal(TreeNode root , List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}





