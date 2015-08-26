package Tree;

/**
 * Created by nithyapari on 8/7/15.
 */
public class Tree {

    Node root = null;

    public static void main(String[] args){

        int[] TreeNodeValues = {20, 30, 10, 25, 17, 8};

        //Creating a Binary Search Tree
        Tree bst = new Tree();
        Node root = bst.createBinarySearchTree(TreeNodeValues);

        //Tree Traversal
        Traversal visit = new Traversal();
        System.out.println("Tree Traversal");
        System.out.println("In-Order: "); visit.inOrder(root);
        System.out.println("\nPre-Order: "); visit.preOrder(root);
        System.out.println("\nPost-Order: "); visit.postOrder(root);

        //Tree Height
        TreeProperties tree = new TreeProperties();
        System.out.println("\n\nTree Height: " + tree.getTreeHeight(root));

        //Search Tree Node in Binary Search Tree
        SearchBST search = new SearchBST();
        System.out.println("Smallest Node: "+search.findSmallestNode(root));
        System.out.println("Largest Node: "+search.findLargestNode(root));

        //Check if it is a Binary Search Tree
        CheckBST check = new CheckBST();
        check.isBST(root);


    }

    Node createBinarySearchTree(int[] TreeNodeValues){

        for(int nodeValue : TreeNodeValues){

            if(root == null){
                root = new Node(nodeValue);
            }
            else {
                //Checking if the node is already present in the tree
                if (root.value == nodeValue) {
                    System.out.println("Node is already in Tree");
                    return null;
                }

                //Creating the node for the nodeValue and inserting it
                // in the right position in Binary Search Tree
                Node node = new Node(nodeValue);
                putNode(node, root);
            }
        }

        return root;
    }

    //Function to put the new node in the correct position in the Binary Search Tree
    void putNode(Node node, Node root){

        //Check if root is null
        if(root == null || node == null) {

            System.out.println("Error: Root or Node is null");
            return;

        }

        if(node.value < root.value){

            if(root.left != null){
                putNode(node, root.left);
            }
            else
                root.left = node;
        }
        else {

            if(root.right != null){
                putNode(node, root.right);
            }
            else
                root.right = node;
        }
    }
}
