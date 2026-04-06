public class reverseLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
    Node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current =current.next;
    }
    System.out.println("null");
}
// public void reverseIterate(){
//     if(head==null|| head.next==null){
//         return;
//     }
//     Node prev=head;
//     Node current=head.next;
//     while(current!=null){
//         Node next=current.next;
//    current.next=prev;

//    //update
//    prev=current;
//    current=next;
//     }
//     head.next=null;
//     head=prev;
// }
public Node reverseRecursive(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
}
    public static void main(String[] args) {
        reverseLL list=new reverseLL();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.printList();
        // list.reverseIterate();
        // list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
