import java.util.*;

public class stack {
    public static void main(String[] arg)
    {
        ArrayDeque<Integer>st=new ArrayDeque<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
    }
}
