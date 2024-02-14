package BinaryTree.Day5Challenge;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = BinaryTreePath.binaryTreePaths(root);
        System.out.println(result);
    }
    public  static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        binaryTreePath(root,"",list);
        return list;
    }

    public static  List<String> binaryTreePath(TreeNode root,String path,List<String> list){
        if(root == null){
            return list;
        }
        if(root.left == null && root.right == null){
            list.add(path + root.val);
            return list;
        }
        binaryTreePath(root.left,(path + root.val + "->"),list);
        binaryTreePath(root.right,(path + root.val + "->"),list);
        return list;
    }
}

