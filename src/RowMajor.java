import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class RowMajor {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=100001) {
            while (t-- > 0) {
                int n = in.nextInt();
                if(n>=1)
                {
                    Set<Integer> hash_Set = new HashSet<Integer>();
                    for(int i=1;i<=n/2;i++)
                    {
                        if(n%i==0)
                        {
                            hash_Set.add(i+1);
                        }
                        if(n/i!=i)
                        {
                            hash_Set.add(n/i+1);
                        }

                    }
                    ArrayList<Integer>arr=new ArrayList<>();
                    for (Integer value : hash_Set)
                    {
                        arr.add(value);
                    }
                    int temp=0;
                    for(int i=1;i<arr.size();i++)
                    {
                        if(arr.get(i)-arr.get(i-1)!=1)
                        {
                            temp=i;
                            break;
                        }

                    }
                    ArrayList<Character>result=new ArrayList<>();
                    int cmp=0;

                    for(int i=0;i<=temp;i++)
                    {
                        char ch=(char)('a'+cmp);
                        for(int j=i;j<n;j+=temp+1)
                        {
                            result.add(ch);

                        }
                        cmp+=1;
                    }
                    for(int i=0;i<result.size();i++)
                    {
                        System.out.print(result.get(i));
                    }
                    System.out.println();

                }

            }
        }
    }
}
