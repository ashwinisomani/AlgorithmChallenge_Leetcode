package BinaryTree.Day6Challenge;

import BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class  Node{
    int val;
    Node left;
    Node right;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class PopulatingNextRightPointerToEachOther {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new  Node(2);
        root.right = new  Node(3);
        root.left.left = new  Node(4);
        root.left.right = new  Node(5);
        root.right.left = new  Node(6);
        root.right.right = new  Node(7);

        Node result = PopulatingNextRightPointerToEachOther.connect(root);
        System.out.println(result);
    }

    public static Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null) return root;

        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> res = new LinkedList<>();
            int size = queue.size();

            for(int i= 0 ; i< size ; i++){
                Node curr = queue.poll();
                if (i < size - 1) {
                    curr.next = queue.peek();
                }
                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }

        return root;
    }
}

