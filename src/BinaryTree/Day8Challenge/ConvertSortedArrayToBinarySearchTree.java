package BinaryTree.Day8Challenge;

import BinaryTree.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
      int[] numbers =  {-10,-3,0,5,9};
      TreeNode result =  ConvertSortedArrayToBinarySearchTree.sortedArrayToBST(numbers);
      System.out.println(result);
    }

    public  static TreeNode sortedArrayToBST(int[] nums) {
        return  helper(nums,0,nums.length-1);
    }

    public static TreeNode helper(int[] nums, int start , int end){
        if(start > end) return null ;

        int mid = start + (end - start)/2;
        TreeNode root   = new TreeNode(nums[mid]);
        root.left = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);

        return root;
    }

}

