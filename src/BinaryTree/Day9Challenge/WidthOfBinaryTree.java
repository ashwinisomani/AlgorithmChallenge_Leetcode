package BinaryTree.Day9Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        int result = WidthOfBinaryTree.widthOfBinaryTree(root);
        System.out.println(result);


    }
    public static int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        int width = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> idxqueue = new LinkedList<>();

        queue.offer(root);
        idxqueue.offer(1);

        while(!queue.isEmpty())
        {
            int level = queue.size();
            int leftIdx = 0, rightIdx = 0;

            for(int i = 0; i < level; i++)
            {
                TreeNode temp = queue.poll();
                int idx = idxqueue.poll();

                if(i == 0)
                    leftIdx = idx;
                if(i == level - 1)
                    rightIdx = idx;

                if(temp.left != null)
                {
                    queue.offer(temp.left);
                    idxqueue.offer(idx * 2);
                }
                if(temp.right != null)
                {
                    queue.offer(temp.right);
                    idxqueue.offer(idx * 2 + 1);
                }
            }
            width = Math.max(width, rightIdx - leftIdx + 1);
        }
        return width;
    }
}

