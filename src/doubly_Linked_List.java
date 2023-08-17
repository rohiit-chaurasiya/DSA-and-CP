import javax.swing.plaf.synth.SynthLookAndFeel;

public class doubly_Linked_List {
    Node head;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val)
        {
            this.val=val;
        }

        Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public void insert(int val)
    {
        Node new_node=new Node(val);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
        {
            head.prev=new_node;
        }
        head=new_node;

    }

    public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] arg)
    {
        doubly_Linked_List dll=new doubly_Linked_List();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);
        dll.insert(60);
        dll.display();



    }
}
