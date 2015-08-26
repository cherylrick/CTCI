package Tree;

/**
 * Created by nithyapari on 8/24/15.
 */
public class TreeProperties {

    //Root – The top node in a tree.
    Node getTreeRoot(){

        return null;
    }
    //Parent – The converse notion of child.
    Node getParent(Node child){

        return null;
    }

    //Siblings – Nodes with the same parent.
    boolean checkIfSiblings(Node child1, Node child2){

        return false;
    }

    //Descendant – a node reachable by repeated proceeding from parent to child.
    boolean checkIfDescendant(Node current, Node descendant){

        return false;
    }

    //Ancestor – a node reachable by repeated proceeding from child to parent.

    //Leaf – a node with no children.
    //External node – a node with no children.
    boolean isLeaf(Node node){

        if(node.left == null && node.right == null)
            return true;

        return false;
    }

    //Internal node – a node with at least one child.
    boolean isInternalNode(Node node){

        if(node.left != null || node.right != null)
            return true;

        return false;
    }


    //Degree – number of sub trees of a node.
    int getNodeDegree(Node node){

        return -1;
    }

    //Edge – connection between one node to another.
    boolean isConnected(Node from, Node to){

        if(from.left == to || from.right == to)
            return true;

        return false;
    }

    //Path – a sequence of nodes and edges connecting a node with a descendant.

    //Level – The level of a node is defined by 1 + the number of connections between the node and the root.

    //Height of tree –The height of a tree is the number of edges on the longest downward path between the root and a leaf.
    int getTreeHeight(Node root){

        int leftHeight = 0;
        int rightHeight = 0;

        if(root == null)
            return 0;

        if(root.left != null)
            leftHeight = getTreeHeight(root.left);

        if(root.right != null)
            rightHeight = getTreeHeight(root.right);

        return (leftHeight > rightHeight? leftHeight:rightHeight)+1;
    }

    //Height of node –The height of a node is the number of edges on the longest downward path between that node and a leaf.
    int getNodeHeight(Node node){

        return getTreeHeight(node);
    }

    //Depth –The depth of a node is the number of edges from the node to the tree's root node.



}
