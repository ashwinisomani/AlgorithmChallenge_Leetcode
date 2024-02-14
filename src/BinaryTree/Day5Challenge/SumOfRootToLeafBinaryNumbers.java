package BinaryTree.Day5Challenge;

import BinaryTree.TreeNode;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        int result = SumOfRootToLeafBinaryNumbers.sumRootToLeaf(root);
        System.out.println(result);

    }
    static int sum = 0 ;
    public  static int sumRootToLeaf(TreeNode root) {
        return helper(root , 0);
    }

    public static int helper(TreeNode node, int sum)
    {
        if(node == null) return 0;
        sum = (sum * 2) + node.val;
        if(node.left == null && node.right == null)
            return sum;
        return helper(node.left, sum) + helper(node.right, sum);
    }
}

