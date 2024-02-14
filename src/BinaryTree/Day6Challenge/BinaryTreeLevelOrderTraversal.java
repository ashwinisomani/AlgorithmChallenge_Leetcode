package BinaryTree.Day6Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);

            List<List<Integer>> result = BinaryTreeLevelOrderTraversal.levelOrder(root);
           System.out.println(result);
    }
    public static List<List<Integer>> levelOrder( TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();

      if(root == null) return result;

      queue.add(root);

      while(!queue.isEmpty()){
        List<Integer> res = new LinkedList<>();
        int size = queue.size();

        for(int i= 0 ; i< size ; i++){
            TreeNode curr = queue.poll();
            res.add(curr.val);

            if(curr.left != null){
                queue.add(curr.left);
            }

            if(curr.right != null){
                queue.add(curr.right);
            }
        }
        result.add(res);
    }
      return result;
  }
}

