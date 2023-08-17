import java.security.PublicKey;
import java.util.*;

public class Iterator_test {
    public static void printAll(Collection<Integer>arr)
    {
        Iterator<Integer>it=arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }

    public static void main(String [] arg)
    {
        Collection<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
//        printAll(arr);
        int i=2;
        for(int j=0;j<4;j++)
        {
            if(i==j)
            {
                i=20;
            }
        }
        System.out.println(i);


    }

}
