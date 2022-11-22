import java.io.*;
public class DoublyLinkedList
{
    class Node
    {
        int data;
        Node previous;
        Node next;

        public Node(int data){
            this.data= data;//this keyword is used here to show that the data is not the local variable data 
            //but the instance variable data
        }
    }
    Node head,tail=null;
    public void addNode(int data)
    {
        Node newNode =new Node(data);
        if (head==null)
        {
            head=tail=newNode; 
            head.previous=null;
            tail.next=null;

        }
        else
        {
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    public void display()
        {
            Node ptr = head;
        
        if(head==null)
        {
            System.out.println("list is empty");
            return;

        }
        System.out.println("Nodes of doubly linked list");
        while(ptr!=null)
        {
            System.out.print(ptr.data + " ");
            ptr=ptr.next;
        }

}
public static void main (String args[])
{
    DoublyLinkedList dList = new DoublyLinkedList();
    dList.addNode(1);
    dList.addNode(2);
    dList.addNode(3);
    dList.display();
}
        
    
}
