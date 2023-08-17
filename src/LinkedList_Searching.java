public class LinkedList_Searching {
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

    public void search_node(int val)
    {
        if(head==null)
        {
            System.out.println("Linked list is Empty");
        }
        if(head.next==null)
        {
            System.out.println("Node is: "+true);
        }
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==val)
            {
                System.out.println("Element is :"+true);

            }
            temp=temp.next;
        }

        System.out.println("Element Not Present");
    }


    public static void main(String[] arg)
    {
        LinkedList_Searching ll=new LinkedList_Searching();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.search_node(90);
        System.out.println("yhh: "+ll.head.next);


    }

}
