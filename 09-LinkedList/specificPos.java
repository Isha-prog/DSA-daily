import org.w3c.dom.Node;

public class specificPos {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static Node insertAtPosition(Node head, int data, int pos) {

        Node newNode = new Node(data);

        
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
     public static Node deleteAtPosition(Node head, int pos){
if(head==null){
    System.out.println("List is empty");
    return head;
}
if(pos==1){
    head=head.next;
    return head;
}
Node current=head;
for(int i=0;i<pos-1&&current!=null;i++){
current=current.next;
}
if(current==null||current.next==null){
    System.out.println("Invalid psotiion");
}
current.next=current.next.next;
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
        head=deleteAtPosition(head,2 );
        System.out.println("After delete");
        printList(head);
    }
}
    


