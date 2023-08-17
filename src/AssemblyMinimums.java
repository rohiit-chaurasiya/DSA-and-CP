import java.util.*;
import java.util.HashMap;
import java.util.Scanner;


public class AssemblyMinimums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if(kiet>=1) {
            while (kiet-->0)
            {
                int n=in.nextInt();
                int len=(n*(n-1))/2;
                if(n>=2)
                {
                    ArrayList<Long>arr=new ArrayList<>();
                    HashMap<Long,Long>map=new HashMap<>();
                    for(int i=0;i<len;i++)
                    {
                        arr.add(in.nextLong());
                    }
                    for(int i=0;i<len;i++)
                    {
                        if(map.containsKey(arr.get(i)))
                        {
                            map.put(arr.get(i),map.get(arr.get(i))+1);
                        }
                        else{
                            map.put(arr.get(i),(long)1);
                        }
                    }
                    long res=n-1;
                    ArrayList<Long>temp=new ArrayList<>();
                    for(Map.Entry<Long,Long> e : map.entrySet())
                    {
                        if(res==e.getValue())
                        {
                            temp.add(e.getKey());
                            res--;
                        }
                        else{
                            long curr=res,curr1=0;
                            while(curr>0 && e.getValue()!=curr1)
                            {
                                curr1+=curr;
                                temp.add(e.getKey());
                                curr-=1;
                            }
                            res=curr;
                        }
                    }

                    for(int i=0;i<temp.size();i++)
                    {
                        System.out.print(temp.get(i)+" ");
                    }

                    long temp3=temp.size();
                    while(temp3!=n)
                    {
                        System.out.print(1000000000+" ");
                        temp3+=1;
                    }
                    System.out.println();
                }
            }
        }
    }
}
