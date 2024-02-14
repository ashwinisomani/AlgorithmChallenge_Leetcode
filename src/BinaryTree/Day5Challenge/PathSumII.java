package BinaryTree.Day5Challenge;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        List<List<Integer>> result = PathSumII.pathSum(root,targetSum);
        System.out.println(result);

    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> res =new ArrayList<>();
        helper(root,targetSum,result ,res);
        return result;
    }

    public static void helper(TreeNode root,int targetSum,List<List<Integer>> result, List<Integer> res) {
        if(root==null) return;

        res.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null) {
            result.add(new ArrayList<>(res));
        }


        helper(root.left,targetSum-root.val,result,res);
        helper(root.right,targetSum-root.val,result,res);
        res.remove(res.size()-1);
    }
}


