import java.lang.reflect.Array;
import java.util.ArrayList;

public class recursion_test1 {


    public static void main(String[] arg)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        arr.add(2,9);
        System.out.println(arr.get(2));



    }
}
