package Graphs;
import java.util.*;
import Graphs.Node;

/**
 * Created by nithyapari on 8/1/15.
 */
public class Graph {

    static HashMap<Integer, Node> graphDataNodeMap = new HashMap<Integer, Node>();

    public static void main(String[] args) {

        Graph G = new Graph();
        G.createGraph();
    }

    void createGraph() {

        //Creating the Graph Nodes
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();

        //Adding Neighbours for Graph Node n1
        n1.addNeighbour(n2);
        n1.addNeighbour(n4);

        //Adding Neighbours for Graph Node n2
        n2.addNeighbour(n1);
        n2.addNeighbour(n2);
        n2.addNeighbour(n4);
        n2.addNeighbour(n5);

        //Adding Neighbours for Graph Node n4
        n4.addNeighbour(n1);
        n4.addNeighbour(n2);
        n4.addNeighbour(n5);

        //Adding Neighbours for Graph Node n5
        n5.addNeighbour(n2);
        n5.addNeighbour(n4);
        n5.addNeighbour(n6);

        //Adding Neighbours for Graph Node n6
        n6.addNeighbour(n5);

    }

    void createGraph(HashMap<Integer, ArrayList<Integer>> adjacencyList) {

        //Test Case
        if(adjacencyList.isEmpty())
            return;

        if(adjacencyList == null)
            return;

        //Creating all the nodes of the Graph
        for (int nodeData : adjacencyList.keySet()) {
            Node node = new Node();
            node.setValue(nodeData);

            //Add Graph Nodes to the HashMap graphDataNodeMap
            graphDataNodeMap.put(nodeData, node);
        }

        //Setting neighbours of Graph Nodes
        Iterator<Integer> it = adjacencyList.keySet().iterator();

        //For each Graph Node, adding its neighbour nodes, if present
        while (it.hasNext()) {

            //Extracting the Node Data and its neighbours
            int nodeData = it.next();
            ArrayList<Integer> neighbourDataList = adjacencyList.get(nodeData);

            //Getting the Graph Node that matches this data
            Node node = graphDataNodeMap.get(nodeData);

            //Such a neighbour node is not part of the Graph
            if(node == null)
                return;

            //If this Graph Node has neighbours, then add it as neighbour to this node
            if (!neighbourDataList.isEmpty()) {
                for (int neighbourData : neighbourDataList)
                    node.addNeighbour(graphDataNodeMap.get(neighbourData));
            }
        }
    }

    void printGraph(Graph graph) {

    }

}
