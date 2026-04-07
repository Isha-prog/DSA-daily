import org.w3c.dom.Node;

public class specificPos {
   
    

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at position
    public static Node insertAtPosition(Node head, int data, int pos) {

        Node newNode = new Node(data);

        // Case 1: insert at beginning
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        // traverse to (pos-1)
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // invalid position
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        // insert node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Before: ");
        printList(head);

        head = insertAtPosition(head, 25, 2);

        System.out.print("After: ");
        printList(head);
    }
}
    


