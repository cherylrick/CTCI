package Tree;

import com.sun.tools.javac.comp.Check;

/**
 * Created by nithyapari on 8/25/15.
 */
public class CheckBST {

    //Setting the smallest integer in the previousNode
    int previousValue = Integer.MIN_VALUE;

    //Setting Flag
    int flag = 0;

    /**  Check if Binary Tree is Binary Search Tree
     *   Note: InOrder Traversal of BST should be in Ascending Order ( Left, Root, Right )
     */
    void isBST(Node root){

        if(root == null)
            return;

        isBST(root.left);
        if(root.value > previousValue)
            previousValue = root.value;
        else {
            System.out.println("Not a Binary Search Tree");
            flag = -1;
            return;
        }
        isBST(root.right);

    }
}
