package Tree;
import java.util.LinkedList;

/**
 * Created by nithyapari on 8/24/15.
 */
public class ConvertBST {

    /** Convert BST to a Sorted Singly Linked List
     *  In-Order traversal of a BST actually lists nodes in Sorted Ascending Order
     */

    LinkedList<Node> singlyList = new LinkedList<Node>();
    Node current = null;
    Node prev;

    LinkedList getSinglySortedList(Node root){

        if(root == null)
            return null;

        getSinglySortedList(root.left);

        prev = root;
        getSinglySortedList(root.right);

        return singlyList;

    }

    //Convert BST to a Sorted Doubly Linked List
}
