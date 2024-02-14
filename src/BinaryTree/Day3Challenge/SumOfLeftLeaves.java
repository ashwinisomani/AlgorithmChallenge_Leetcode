package BinaryTree.Day3Challenge;

import BinaryTree.TreeNode;
import com.sun.source.tree.Tree;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = SumOfLeftLeaves.sumOfLeftLeaves(root);
        System.out.println(result);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        return findSum(root);
    }
    public static int findSum(TreeNode root){
        if(root==null) return 0;
        int sum = 0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum += root.left.val;
        }
        sum +=  findSum(root.left);
        sum +=  findSum(root.right);
        return sum;
    }
}

