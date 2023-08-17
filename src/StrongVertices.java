import java.util.*;

public class StrongVertices {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if(kiet>=1) {
            while (kiet-- > 0)
            {
                int len = in.nextInt();
                if(len>=2)
                {
                    ArrayList<Long>arr=new ArrayList<>();
                    for(int i=0;i<len;i++)
                    {
                        arr.add(in.nextLong());
                    }

                    ArrayList<Long>arr2=new ArrayList<>();
                    for(int i=0;i<len;i++)
                    {
                        arr2.add(in.nextLong());
                    }

                    ArrayList<Long>res=new ArrayList<>();
                    long temp1=Long. MAX_VALUE;
                    long temp2=Long.MIN_VALUE;

                    for(int i=0;i<len;i++)
                    {
                        temp1=Math.min(temp1,(arr.get(i)-arr2.get(i)));
                        temp2=Math.max(temp2,arr.get(i)-arr2.get(i));
                    }
                    for(int i=0;i<len;i++)
                    {
                        if(temp2==arr.get(i)-arr2.get(i))
                        {
                            res.add((long)i+1);
                        }
                    }
                    System.out.println(res.size());
                    for(int i=0;i<res.size();i++)
                    {
                        System.out.print(res.get(i)+" ");
                    }
                    System.out.println();

                }
            }
        }
    }
}
