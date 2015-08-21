package LinkedList;

/**
 * Created by nithyapari on 8/2/15.
 */
public class LinkedList {


    //Function to create the Linked List
    public Node initializeList(){

        int val;
        Node head = null;

        for(val = 1; val <=7; val++ ){
            Node newNode = new Node(val, null);

            if(head == null){
                head = newNode;
            }
            else {

                newNode.next = head;
                head = newNode;
            }
        }

        return head;

    }

    //Function to Print the linked list
    void printList(Node head){

        if(head == null){
            System.out.println("Linked List is empty.");
        }
        Node printHead = head;

        while(printHead != null){
            System.out.println(printHead.value);
            printHead = printHead.next;
        }
    }
}
