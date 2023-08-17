public class DLL {
    node head;

    class node{
        int val;
        node next;
        node prev;

        node(int val)
        {
            this.val=val;
        }
        node(int val,node next,node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
    public void insertFirst(int val)
    {
        node new_node=new node(val);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
        {
            head.prev=new_node;
        }
        head=new_node;
    }

    public void insertLast(int val)
    {
        node new_node=new node(val);
        node temp=head;
        new_node.next=null;
        if(head==null)
        {
            new_node.prev=null;
            head=new_node;
            return;
        }

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }

    public node find(int val)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.val==val)
            {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void insertAfter(int curr,int newAdd)
    {
        node f=find(curr);
        if(f==null)
        {
            System.out.println("Node does not exist");
            return;
        }

        node new_node=new node(newAdd);
        new_node.next=f.next;
        f.next=new_node;
        new_node.prev=f;
        if(new_node.next!=null)
        {
            new_node.next.prev=new_node;
        }





    }



    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void main(String[] arg)
    {
        DLL ob=new DLL();
        ob.insertFirst(2);
        ob.insertFirst(5);
        ob.insertFirst(7);
        ob.display();
        ob.insertLast(10);
        ob.insertLast(11);
        ob.display();
        ob.insertAfter(10,15);
        System.out.println("Add after 10: -> ");
        ob.display();


    }
}
