import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        next=prev=null;
    }
}
public class AddFirst {
    Node head;
    public void insertAtFirst(int data){
        Node newNode=new Node(data);
       if(head!=null){
        newNode.next=head;
       
        head.prev=newNode;
       }
        head=newNode;
    }
    public void display(){
        Node current=head;
        while ((current!=null)) {
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("null");
    }
  
    public static void main(String[] args) {
        AddFirst dll = new AddFirst();

        dll.insertAtFirst(10);
        dll.insertAtFirst(20);
        dll.insertAtFirst(30);

        dll.display();
    }
}

