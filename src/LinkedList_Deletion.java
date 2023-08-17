public class LinkedList_Deletion {
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

    public void insert(int val)
    {
        Node new_node=new Node(val);
        new_node.next=head;
        head=new_node;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public int deleteFirst()
    {
        int value=head.val;
        head=head.next;
        return value;

    }

    public int deleteLast()
    {
        Node last=head;
        int lastData=0;
        while(last.next.next!=null)
        {
            last=last.next;
        }
        lastData=last.next.val;

        last.next=null;
        return lastData;

    }

    public int deleteIndex(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        Node prev=head;


        for(int i=1;i<index;i++)
        {
            prev=prev.next;
        }
        int indexElemenet=prev.next.val;
        prev.next=prev.next.next;
        return indexElemenet;
    }


    public static void main(String[] arg)
    {
        LinkedList_Deletion ll=new LinkedList_Deletion();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.display();

        System.out.println("Deleted First Item: "+ll.deleteFirst());
        ll.display();

        System.out.println("Delete Last Item: "+ll.deleteLast());
        ll.display();

        System.out.println("Delete at Index 2: "+ll.deleteIndex(2));
        ll.display();






    }
}
