package Graphs;
import java.util.*;

/**
 * Created by nithyapari on 8/1/15.
 */
public class Node {
    int value;
    ArrayList<Node> neighbours;

    //Constructor
    Node(){
        this.value = -1;
        this.neighbours = null;
    }

    //Constructor
    Node(int value, ArrayList<Node> neighbours){
        this.value = value;
        this.neighbours = neighbours;
    }

    void addNeighbour(Node neighbour){

        if(neighbour == null)
            throw new IllegalArgumentException("No such Node in Graph");
        neighbours.add(neighbour);
    }

    ArrayList<Node> getNeighbours(){
        return neighbours;
    }

    void setValue(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }
}

