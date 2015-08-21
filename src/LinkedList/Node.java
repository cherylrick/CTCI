package LinkedList;

/**
 * Created by nithyapari on 8/2/15.
 */
public class Node {
    int value;
    Node next;

    Node(){
        this.value = -1;
        this.next = null;
    }

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}
