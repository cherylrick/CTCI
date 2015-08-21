package Tree;

/**
 * Created by nithyapari on 8/7/15.
 */
public class Tree {

    // Kavin - root need not be static here. risky and subjective to modifications by multiple code
    static Node root = null;

    public static void main(String[] args){

        int[] TreeNodeValues = {20, 30, 10, 25, 17, 8};

        //Creating a Binary Search Tree
        // Kavin - variable names should always begin with a small letter
        Tree BST = new Tree();
        BST.createBinarySearchTree(TreeNodeValues);
        // Kavin - why is treeorder a separate class? nothing wrong in it though
        TreeOrder visit = new TreeOrder();
        visit.inorder(root);

    }

    void createBinarySearchTree(int[] TreeNodeValues){

        // Kavin - whenever you have a method named as create*Tree(), it is best if it always returns the root created.

        for(int nodeValue : TreeNodeValues){

            if(root == null){
                root = new Node(nodeValue);
            }
            else {
                //Checking if the node is already present in the tree
                if (root.value == nodeValue) {
                    System.out.println("Node is already in Tree");
                    return;
                }

                //Creating the node for the nodeValue and inserting it
                // in the right position in Binary Search Tree
                Node node = new Node(nodeValue);
                putNode(node, root);
            }
        }
    }

    //Function to put the new node in the correct position in the Binary Search Tree
    void putNode(Node node, Node root){
        // Kavin - edge condition has to be checked for null
        Node current = root;

        if(node.value < current.value){

            if(current.left != null){
                // Kavin -  instead of saying current = current.left, why not putNode(node, current.left)?
                current = current.left;
                putNode(node, current);
            }
            else
                current.left = node;

        }
        else {

            if(current.right != null){
                // same as above
                current = current.right;
                putNode(node, current);
            }
            else
                current.right = node;
        }
    }

    //Function to print the height of the tree
    void findTreeHeight(Node root){


    }


}
