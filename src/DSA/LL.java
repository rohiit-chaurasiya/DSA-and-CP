package DSA;

public class LL {
    static Node head;
    Node tail;
    int size;
    class Node{
        int value;
        Node next;
        Node(int data)
        {
            this.value=data;
            this.next=null;
        }
        Node(int data, Node next)
        {
            this.value=data;
            this.next=next;
        }
    }
    public void insertFirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;

    }
    public void inserAfter(int data,int index)
    {
        if(index==0)
        {
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        Node newNode=new Node(data,temp.next);
        temp.next=newNode;

    }

    //-----------------------------Delete----------------------------------

    public int deleteFirst()
    {
        int val=head.value;
        head=head.next;
        return val;

    }

    public int deleteLast(){

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.value;
        temp.next=null;


        return val;
    }

    public int deleteAtindex(int index)
    {
        int val;
        if(index==0)
        {
            val=head.value;
            return val;
        }

        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        val=temp.value;
        temp.next=temp.next.next;
        return val;

    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }



    public static void main(String[] arg)
    {
        LL l=new LL();
        l.insertFirst(4);
        l.insertFirst(5);
        System.out.println(head.next.value);
//        l.insertFirst(6);
//        l.insertFirst(7);
//        l.insertFirst(8);
//        l.insertLast(9);
//
//        l.inserAfter(15,0);
//        l.inserAfter(16,5);
//        l.display();
//
//        System.out.println("Delete form first: "+l.deleteFirst());
//        System.out.println("Delete form Last: "+l.deleteLast());
//        int del=l.deleteAtindex(3);
//        System.out.println("Deleted element from the position 3 is: "+del);







    }
}
