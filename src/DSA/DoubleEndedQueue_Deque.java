package DSA;

import java.util.ArrayDeque;
import java.util.*;
import java.util.Deque;

public class DoubleEndedQueue_Deque {
    public static void main(String[] arg)
    {
        Deque<Integer>dq=new ArrayDeque<>();
        dq.add(3);
        dq.add(4);
        dq.add(5);

        dq.addFirst(2);
        dq.addLast(6);

        System.out.println(dq);
    }
}
