package BinaryTree.Day3Challenge;

import BinaryTree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class FindAllTheLonelyNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        List<Integer> result = FindAllTheLonelyNodes.getLonelyNodes(root);
        System.out.println(result);
    }

    static List<Integer> result = new LinkedList<>() ;
    public static List<Integer> getLonelyNodes(TreeNode root) {
        if(root == null) {
            return result;
        }

        if(root.left == null && root.right != null){
            result.add(root.right.val);
        }
        else if(root.left != null && root.right == null){
            result.add(root.left.val);
        }
        getLonelyNodes(root.left);
        getLonelyNodes(root.right);

        return result;

    }
}

