package Tree;

/**
 * Created by nithyapari on 8/24/15.
 */
public class SearchBST {

    /**
     * Find Smallest Node in Binary Search Tree
     * Note: The smallest node in the Binary Search Tree would be
     *       the left most child in the tree
     * @param root
     * @return
     */
    Integer findSmallestNode(Node root){

        //Checking if the Binary Search Tree exists
        if(root == null)
            return null;

        while(root.left != null)
            root = root.left;

        return root.value;
    }

    /**
     * Find Largest Node in Binary Search Tree
     * Note: The largest node in the Binary Search Tree would be
     *       the right most child in the tree
     * @param root
     * @return
     */
    Integer findLargestNode(Node root){

        //Checking if the Binary Search Tree exists
        if(root == null)
            return null;

        while(root.right != null)
            root = root.right;

        return root.value;
    }
}
