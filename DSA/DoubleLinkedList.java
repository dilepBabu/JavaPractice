public class DoubleLinkedList {
    class Node{
        int data;
        
        int prev;
        public Node(int data){
            this.data=data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public Node next=null;

    public void insert(int data){
        Node n = new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
            
        }
        else{
            n.prev=head.next;
            head.next=n;
            tail=n;
            
        }
        
    }
    public static void main(String ab[])
    {
        DoubleLinkedList ddl=new DoubleLinkedList();
        ddl.insert(10);
        
    }
}
