public class mergeSorted {
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
public Node merge2LL(Node head1,Node head2){
    if(head1==null || head2==null){
return head2==null?head1:head2;
    }
    if(head1.data<=head2.data){
        head1.next=merge2LL(head1.next, head2);
        return head1;
    }else{
        head2.next=merge2LL(head1, head2.next);
        return head2;
    }
}
}
