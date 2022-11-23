import java.io.*;
public class DLL
{
    class Node
    {
        int data;
        Node previous;
        Node next;

       Node(int d) { data = d; }
    }
    Node head,tail=null;

    public void addNode(int new_data)
    {
        Node newNode =new Node(new_data);
        new_Node.next = head;
        new_Node.prev= null;
       
       if(head!= null)
       head.prev =new_Node;
       head=new_Node;
    }
    public void display()
        {
            Node last = null;

            while(node!= null) {
                System.out.print(node.data + " ");
                last = node;
                node= node.next;
            }
        System.out.println();
        }

        void deleteNode(Node del)
        {
            if(head==null || del== null){
                return;
            }
            if (head==del){
                head= del.next;
            }
            if(head== del) {
                head= del.next;
            }

            if(del.next!= null)
            {
                del.next.prev =del.prev;
            }
            if(del.prev != null){
                del.prev.next =del.next;
            }
            return;
        }

        public static void main(String[] args)
        {
            DLL dll = new DLL();
            dll.addNode(2);
            dll.addNode(4);
            dll.addNode(8);
            dll.addNode(10);
            System.out.println("original linked list");
            dll.display(dll.head);


            dll.deleteNode(dll.head);
            dll.deleteNode(dll.head.next);
            dll.deletenode(dll.head.next);
            System.out.print( "New link list ");
            dll.display(dll.head);
         }
}
