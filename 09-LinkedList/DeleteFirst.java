public class DeleteFirst {
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
    }
    public void deleteLast(){
         if(head==null){
            System.out.println("list is empty");
        }
        Node secondLast=head;
        Node lastNode=head.next;
        if(head.next==null){
            head=null;
            return;
        }
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
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
       DeleteFirst list=new DeleteFirst();
       list.addFirst("a");
       list.addFirst("is"); 
       list.addLast("girl");
       list.addFirst("this");
       list.printList();
       list.deleteFirst();
       list.deleteLast();
       list.printList();
    }
}

