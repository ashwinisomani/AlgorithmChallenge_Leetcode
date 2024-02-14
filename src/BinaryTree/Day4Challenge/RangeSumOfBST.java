package BinaryTree.Day4Challenge;


import BinaryTree.TreeNode;

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        int low  = 7 ;
        int high = 15;

        int result = RangeSumOfBST.rangeSumBST(root, low, high);
        System.out.println(result);
    }
    static int sum = 0;
    public static int rangeSumBST(TreeNode root, int low, int high) {
    if(root == null) return 0;

        if(root.val >= low && root.val <= high){
        sum += root.val;
    }

    rangeSumBST(root.left  , low , high);
    rangeSumBST(root.right , low , high);

        return sum;
   }
}

