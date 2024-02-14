package BinaryTree.Day1Challenge;

import BinaryTree.Node;

import java.util.LinkedList;
import java.util.List;

public class NaryPreOrderTraversal {
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

        List<Integer> result = NaryPreOrderTraversal.preorderNaryTraversal(root);
        System.out.println(result);
    }


    public static List<Integer> result = new LinkedList<>();

    public static List<Integer> preorderNaryTraversal(Node root) {
        preorder(root);
        return result;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }

        result.add(root.val);

    }
}

//Time Complexity  = O(N)
//Space Complexity = O(N)



