import java.util.*;
public class toArray {
    public  static void main(String [] arg) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

//        Integer newArr[]=new Integer[arr.size()];
//        newArr=arr.toArray(newArr);
        Integer newArr[]=arr.toArray(new Integer[0]);

        for(Integer x:newArr)
            System.out.println(x);


    }

}
