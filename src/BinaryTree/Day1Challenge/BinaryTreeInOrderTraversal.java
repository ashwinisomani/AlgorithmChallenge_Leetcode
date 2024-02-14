package BinaryTree.Day1Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
    public static void main(String[] args) {
    TreeNode root = new TreeNode(8);
    root.left = new TreeNode(6);
    root.right = new TreeNode(10);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(7);
    root.right.left = new TreeNode(9);
    root.right.right = new TreeNode(12);

    List<Integer> result = BinaryTreeInOrderTraversal.inorderTraversal(root);
    System.out.println(result);
    }
    public static List<Integer> result = new LinkedList<>();
    public static List<Integer>  inorderTraversal(TreeNode root){
     inorder(root);
     return result;
    }

    public static void inorder(TreeNode root){
         if(root == null){
          return ;
        }
      inorder(root.left);
      result.add(root.val);
      inorder(root.right);

    }
}

//Time Complexity  = O(N)
//Space Complexity = O(N)
