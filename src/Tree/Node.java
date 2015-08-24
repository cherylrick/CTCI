package Tree;

/**
 * Created by nithyapari on 8/6/15.
 */
public class Node {
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = right = null;
    }

    @Override
    public boolean equals(Object obj) {
        Node node = (Node) obj;
        boolean returnValue =  (this.value == node.value);
        if(this.left == null ^ node.left == null || this.right == null ^ node.right == null)
            return false;
        returnValue = returnValue && this.left.equals(node.left) && this.right.equals(node.right);
        return returnValue;
    }
}
