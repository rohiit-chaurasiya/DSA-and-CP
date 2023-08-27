package DSA;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class stack {
    public static void main(String[] arg)
    {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Peek"+st.peek());
        System.out.println("Pop"+st.pop());
        System.out.println("Empty"+st.empty());
        System.out.println("Search"+st.search(3));

        ArrayList<Integer>arr=new ArrayList<>();
        arr.addAll(st);


        System.out.println("Copy into ArrayList"+arr.toString());


        System.out.println("Stack Size"+st.size());

    }
}
