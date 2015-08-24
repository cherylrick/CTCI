package Tree;

/**
 * Created by nithyapari on 8/24/15.
 */
public class Traversal {



    /** In-Order Traversal
     *  Print Order: Left, Root, Right
     * @param root
     */
    void inOrder(Node root){

        //Reached Left Node, return
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }

    /** Pre-Order Traversal
     *  Print Order: Root, Left, Right
     * @param root
     */
    void preOrder(Node root){

        //Reached Left Node, return
        if(root == null)
            return;

        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /** Post-Order Traversal
     *  Print Order: Left, Right, Root
     * @param root
     */
    void postOrder(Node root){

        //Reached Left Node, return
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");

    }

}
