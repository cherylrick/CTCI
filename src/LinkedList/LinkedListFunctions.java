package LinkedList;

/**
 * Created by nithyapari on 8/2/15.
 */
public class LinkedListFunctions {

    static LinkedList list = new LinkedList();
    static LinkedList list2 = new LinkedList();
    static Node head = null;

    public static void main(String[] args) {

        head = list.initializeList();
        list.printList(head);

        findMiddleNode();

    }


    /*
     * Print the Middle Node in a Linked List
     */
    static void findMiddleNode(){

        Node firstPointer;
        Node secondPointer;
        firstPointer = secondPointer = head;

        while(secondPointer != null && secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }

        System.out.println("Middle Node is :"+firstPointer.value);
    }

    /*
     * Detect loop in a Singly Linked List
     */
    static void detectLoop(Node head){

    }

    /*
     * Reverse a Singly Linked List
     */
    static void reverseLinkedList(Node head){

    }
}
