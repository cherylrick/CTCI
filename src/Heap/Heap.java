package Heap;

/**
 * Created by nithyapari on 8/5/15.
 */
public class Heap {

    static int heapSize;

    //Index Returning Functions

    //Function to return the Parent index
    int parent(int index){
        return index/2;
    }

    //Function to return Left Child index
    int leftChild(int index){
        return (index * 2);
    }

    //Function to return Right Child index
    int rightChild(int index){
        return (index * 2)+1;
    }

    //Function to check if Nodes Exist
    boolean hasParent(int index){
        return index <= heapSize;
    }

}
