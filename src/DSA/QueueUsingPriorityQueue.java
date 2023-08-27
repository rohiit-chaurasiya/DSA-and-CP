package DSA;

import javax.swing.*;
import java.util.PriorityQueue;
import java.util.*;

public class QueueUsingPriorityQueue {
    public static void main(String[] arg)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);



        Queue<Integer>pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(9);

        pq.addAll(arr);



        Iterator iterator=pq.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        pq.remove(2); //remove the elements from specific position
        System.out.println(pq);
        pq.poll();

        System.out.println(pq);

    }
}
