package BinaryTree.Day4Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class TwoSumIV_InputISBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        int k  = 9 ;

        boolean result = TwoSumIV_InputISBST.findTarget(root, k);
        System.out.println(result);
    }
    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new LinkedList<>();
        if(root == null) return true;

        inorder(root,list);

        int low = 0;
        int high = list.size()-1;

        while(low< high){

            if(list.get(low) + list.get(high) == k){
                return true;
            }
            else if (list.get(low) + list.get(high) < k){
                low++;
            }
            else high--;
        }
        return false;
    }

    public static void inorder(TreeNode root , List<Integer> result){
        if(root == null){
            return;
        }
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }


     //[2 , 3 , 4 , 5 , 6 , 7]
}


