public class circular_Linked_List {
    node head;
    node tail;
    public circular_Linked_List()
    {
        node head=null;
        node tail=null;
    }

    class node{
        int val;
        node next;
        node(int val)
        {
            this.val=val;
        }
    }

    public void insert(int val)
    {
        node new_node=new node(val);
        if(head==null) {
            head = new_node;
            tail = new_node;
            return;
        }

        tail.next=new_node;
        new_node.next=head;
        tail=new_node;
    }

    public void deleteNode(int val)
    {
        node temp=head;
        if(temp==null)
        {
            return;
        }
        if(temp.val==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }

        node n=temp.next;
        do{
            if(n.val==val)
            {
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while(temp!=null);

    }


    public void display()
    {
        node temp=head;
        if(head!=null) {
            do {
                System.out.println(temp.val);
                temp = temp.next;
            }while(temp!=head);
        }
    }

    public static void main(String[] arg)
    {
        circular_Linked_List ob=new circular_Linked_List();
        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.display();
        System.out.println("Delete: ");
        ob.deleteNode(2);
        ob.display();
    }
}
