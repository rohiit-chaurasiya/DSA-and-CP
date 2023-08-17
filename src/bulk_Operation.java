import java.util.ArrayList;
import java.util.*;
public class bulk_Operation {
    public static void main(String[] arg)
    {
        List<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        List<Integer>l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(2);
        System.out.println(l1.containsAll(l2));

        List<Integer>l3=new ArrayList<>();
        l3.add(22);
        l3.add(11);
        l3.add(3);

        l1.addAll(l3);
        System.out.println(l1);

        List<Integer>l4=new ArrayList<>();
        l4.add(22);
        l4.add(11);

//        l1.removeAll(l4);
        System.out.println(l1.removeAll(l4));
        System.out.println(l1);


        System.out.println("------------Stream Methods-------------");
        List<Integer>strm=Arrays.asList(1, 2, 3, 4, 5, 6);

        strm.stream()
        .forEach(x->System.out.print((x)));
        System.out.println();


        strm.stream()
        .filter(y->y>3)
        .forEach(y->System.out.print(y));






    }
}
