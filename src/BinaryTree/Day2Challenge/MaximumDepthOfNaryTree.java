package BinaryTree.Day2Challenge;

import BinaryTree.Node;

public class MaximumDepthOfNaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);

        // Creating child nodes
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        Node child11 = new Node(5);
        Node child12 = new Node(6);

        // Accessing the first child and adding new children to it
        root.children.get(0).children.add(child11);
        root.children.get(0).children.add(child12);

        int result =  MaximumDepthOfNaryTree.maxDepth(root);
        System.out.println(result);

    }

    public static int maxDepth(Node root) {
        if(root == null) return 0;
        int depth = 0 ;
        for(int i = 0 ; i< root.children.size();i++){
            int child = maxDepth(root.children.get(i));
            depth =  Math.max(depth , child);
        }
        return 1 + depth;
    }
}



