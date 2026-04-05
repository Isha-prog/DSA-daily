import java.util.LinkedList;

class AddFirst{
 class Node {
String data;
Node next;
Node( String data){
this.data=data;
this.next=null;
}
    
}
Node head=null;
public void addFirst(String data){
    
     Node newNode=new Node(data);
    
     if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addLast(String data){
    Node newNode=new Node(data);
    
    if(head==null){
   head=newNode;
   return;
    }
    Node currentNode=head;
    while(currentNode.next!=null){
        currentNode=currentNode.next;
    }
    currentNode.next=newNode;
}
public void printList(){
    Node current=head;
    while(current!=null){
        System.out.println(current.data+" ");
        current =current.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
       AddFirst list=new AddFirst();
       list.addFirst("a");
       list.addFirst("is"); 
       list.addLast("girl");
       list.printList();
    }
}