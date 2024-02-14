package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class KthSmallestElementInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;

        int result = KthSmallestElementInBST.kthSmallest(root,k);
        System.out.println(result);
    }
    static List<Integer> result = new LinkedList<>();
    public static int kthSmallest(TreeNode root, int k) {
        inorder(root, result);
        return result.get(k-1);

    }
    public static void inorder(TreeNode root , List<Integer> result){
        if(root == null) return ;

        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}

