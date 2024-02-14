package BinaryTree.Day7Challenge;

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int val) {
        this.val = val;
    }
}
public class LowestCommonAncestorOfBinaryTreeIII {
    public static void main(String[] args) {

    }
    public Node lowestCommonAncestor(Node p, Node q) {
        Node pPointer = p ;
        Node qPointer = q;

        while(pPointer != qPointer){
            pPointer = pPointer.parent == null ? q :  pPointer.parent ;
            qPointer = qPointer.parent == null ? p :  qPointer.parent ;
        }
        return pPointer;
    }
}


//pPointer 4  | 2 | 5 |   3  | NULL | 8 | 1 | 3|
//qPointer 8  | 1 | 3 | NULL |   4  | 2 | 5 | 3|
// pPointer == qPointer

