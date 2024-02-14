package BinaryTree.Day9Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class IncreasingSearchOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);

        TreeNode result = IncreasingSearchOrder.increasingBST(root);
        System.out.println(result);



    }
    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(root , result);
        TreeNode newNode  = new TreeNode(0);
        TreeNode curr = newNode;
        for(int res : result){
            curr.right = new TreeNode(res);
            curr = curr.right;
        }

        return newNode.right;
    }

    public static void inorder(TreeNode root ,  List<Integer> result){
        if(root == null) return ;
        inorder(root.left , result);
        result.add(root.val );
        inorder(root.right, result);
    }
}

