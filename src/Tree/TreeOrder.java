package Tree;

/**
 * Created by nithyapari on 8/12/15.
 */
public class TreeOrder {


    void preorder(Node root){

        if(root != null){
            printNode(root);
            preorder(root.left);
            preorder(root.right);
        }

    }

    void inorder(Node root){

        if(root != null){
            inorder(root.left);
            printNode(root);
            inorder(root.right);
        }

    }

    void postorder(Node root){

        if(root != null){
            postorder(root.left);
            postorder(root.right);
            printNode(root);
        }
    }

    void printNode(Node node){
        System.out.println(node.value);
    }
}
