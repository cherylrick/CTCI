package Heap;

/**
 * Created by nithyapari on 8/5/15.
 * This is the Heap Node
 */
public class Node {
    int value;
    Node left;
    Node right;

    Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
