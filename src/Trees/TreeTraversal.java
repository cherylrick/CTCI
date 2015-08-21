package Trees;

/**
 * Created by nithyapari on 8/1/15.
 */
public class TreeTraversal {

    // Visit Left Node, Current Node and then Right Node
    void inOrderTraversal(Node node){
        if(node != null){
           inOrderTraversal(node.left);
           print(node);
           inOrderTraversal(node.right);
        }
    }

    // Visit Current Node, Left Node and then Right Node
    void preOrderTraversal(Node node){
        if(node != null){
            print(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Visit Left Node, Right Node and then Current Node
    void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            print(node);
        }
    }

    void print(Node node){
        System.out.println(node.value);
    }
}
