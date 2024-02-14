package BinaryTree.Day8Challenge;

import BinaryTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversal {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7} ;
        int[] inorder = {9,3,15,20,7};

        TreeNode root = ConstructBinaryTreeFromPreOrderAndInorderTraversal.buildTree(preorder,inorder);
        System.out.println(root);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map< Integer, Integer > Map = new HashMap< Integer, Integer >();

        for (int i = 0; i < inorder.length; i++) {
            Map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0,
                inorder.length - 1, Map);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[]
            inorder, int inStart, int inEnd, Map < Integer, Integer > Map) {

        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = Map.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder,
                inStart, inRoot - 1, Map);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder,
                inRoot + 1, inEnd, Map);

        return root;
    }
}

