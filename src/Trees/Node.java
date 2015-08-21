package Trees;

/**
 * Created by nithyapari on 8/1/15.
 */

//This is a Binary Tree Node
public class Node {
    int value;
    Node left;
    Node right;

    //Constructor
    Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
