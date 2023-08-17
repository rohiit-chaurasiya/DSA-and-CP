public class Linked_List_1 {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }

    public void insert(int val) //Insert at first Index
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
    }

    public void append(int val) //Insert at Last
    {
        Node new_node=new Node(val);
        if(head==null)
        {
            head = new Node(val);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
    }

    public void insertAfter(Node prev,int val)
    {
        if(prev==null)
        {
            System.out.println("Previous node not be null");
            return;
        }
        Node new_node=new Node(val);
        new_node.next=prev.next;
        prev.next=new_node;
    }

    public void insertFirst(int val)
    {
        Node new_node=new Node(val);
        new_node.next=head;
        head=new_node;
    }

    public void InsertAtIndex(int index,int val)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node new_node=new Node(val,temp.next);
        temp.next=new_node;
    }

    public void display()
    {
        Node temp;
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }


    public static void main(String[] arg)
    {
        Linked_List_1 ll=new Linked_List_1();
        ll.insert(2);
        ll.insert(3);
        ll.insert(8);
        ll.insert(45);
        ll.append(50);
        ll.insertAfter(ll.head.next,90);
        ll.InsertAtIndex(3,100);
        ll.display();
    }
}
