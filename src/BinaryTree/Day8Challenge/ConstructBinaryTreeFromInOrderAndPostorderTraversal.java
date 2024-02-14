package BinaryTree.Day8Challenge;

import BinaryTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInOrderAndPostorderTraversal {
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        TreeNode root = ConstructBinaryTreeFromInOrderAndPostorderTraversal.buildTree(inorder, postorder);
        System.out.println(root);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
        return root;
    }

    private static TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
                               Map<Integer, Integer> map) {

        if (inStart > inEnd || postStart > postEnd)
            return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = map.get(root.val);
        int numsRight = inEnd - inRoot;

        root.left = buildTree(inorder, inStart, inRoot - 1, postorder, postStart, postEnd - numsRight - 1, map);
        root.right = buildTree(inorder, inRoot + 1, inEnd, postorder, postEnd - numsRight, postEnd - 1, map);

        return root;
    }
}

