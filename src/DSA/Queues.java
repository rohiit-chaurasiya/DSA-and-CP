package DSA;
import java.util.*;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] srg)
    {
        System.out.println("Queues is Interface ");

        Queue<Integer>qu=new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5); //Add element to the rear of the queue. If the queue is full , it throws an exception
        qu.offer(6);//dds an element to the rear of the queue. If the queue is full, it returns false.

        System.out.println("Top Element: "+qu.element());//Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
        System.out.println("Top Element: "+qu.peek()); //Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
        System.out.println("First Element remove: "+qu.remove());//Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
        System.out.println("First Element remove: "+qu.poll());//Removes and returns the element at the front of the queue. If the queue is empty, it returns null.

        System.out.println("Check Empty: "+qu.isEmpty());





    }
}
