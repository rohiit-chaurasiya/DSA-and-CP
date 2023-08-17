import java.util.ArrayList;
import java.util.*;


class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}
public class iastest4 {

    private static boolean isSorted(ArrayList<Long>arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        if(test>0)
        {
            while(test-->0)
            {
                int n=in.nextInt();
                if(n>=2)
                {
                    ArrayList<Long>a=new ArrayList<>();
                    List<Pair<Long, Integer>> v = new ArrayList<>();
                    for(int i=0;i<n;i++)
                    {
                        Long x=in.nextLong();
                        a.add(x);
                        v.add(new Pair<>(x, i));
                    }
                    if (isSorted(a)) {
                        System.out.println();
                        return;
                    }

                    v.sort((pair1, pair2) -> Long.compare(pair1.key, pair2.value));

                    Long ans = 0L;

                    for (int i = 0; i < n; i++) {
                        if (i != v.get(i).getValue()) {
                            ans = Math.max(ans, v.get(i).getKey());
                        }
                    }
                    System.out.println(ans);


                }
            }
        }
    }
}
