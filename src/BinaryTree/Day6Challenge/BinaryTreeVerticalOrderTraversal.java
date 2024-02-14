package BinaryTree.Day6Challenge;

import BinaryTree.TreeNode;

import java.util.*;

public class BinaryTreeVerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = BinaryTreeVerticalOrderTraversal.verticalOrder(root);
        System.out.println(result);

    }
    public static List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode , Integer> weight = new HashMap<>();
        Map<Integer , ArrayList<Integer>> map = new HashMap<>();
        queue.add(root);
        weight.put(root,0);
        int min = 0;

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            int w = weight.get(curr);

            if(!map.containsKey(w)){
                map.put(w, new ArrayList<Integer>());
            }
            map.get(w).add(curr.val);

            if(curr.left != null){
                queue.add(curr.left);
                weight.put(curr.left , w-1);
            }

            if(curr.right != null){
                queue.add(curr.right);
                weight.put(curr.right , w+1);
            }

            min = Math.min(min , w);
        }

        while(map.containsKey(min)){
            result.add(map.get(min++));
        }
        return result;
    }
}



