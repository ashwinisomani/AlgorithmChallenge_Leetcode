package BinaryTree.Day3Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);


        boolean result = LeafSimilarTrees.leafSimilar(root1 , root2 );
        System.out.println(result);

    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new LinkedList<>();
        List<Integer> result2 = new LinkedList<>();

        findLeaves(root1, result1);
        findLeaves(root2, result2);

        return result1.equals(result2);
    }

    public static void findLeaves(TreeNode root, List<Integer> result){
        if(root == null) return ;

        if(root.left == null && root.right == null){
            result.add(root.val);
        }

        findLeaves(root.left  , result);
        findLeaves(root.right , result);

    }
}

