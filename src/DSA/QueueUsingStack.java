package DSA;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] arg)
    {

    }
}

class QueueForStack{
    private Stack<Integer>first;
    private Stack<Integer>second;

    public QueueForStack()
    {
        first=new Stack<>();
        second =new Stack<>();

    }

    public void add(int item)
    {
        first.push(item);
    }

    public int remove() throws Exception
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }

        int removed=second.pop();

        while(!second.isEmpty())
        {
            first.push(second.pop());
        }


        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peek=second.peek();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peek;
    }

    public boolean isEmpty()
    {
        return first.isEmpty();
    }


}

