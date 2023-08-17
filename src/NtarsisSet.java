import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NtarsisSet {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n=in.nextInt();
            int k=in.nextInt();
            if(n>=1)
            {
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                    arr.add(in.nextInt());
                }
                int temp=0;
                for(int i=1;i<n;i++)
                {
                    if(arr.get(i)>=arr.get(i-1))
                    {
                        temp+=1;
                    }
                }
                if(temp==n-1)
                {
                    int ans=Integer.MAX_VALUE;
                    for(int i=1;i<n;i++)
                    {
                        int tem=arr.get(i)-arr.get(i-1);
                        ans=Math.min(tem,ans);
                    }
                    if(ans==0)
                    {
                        System.out.println("1");
                    }
                    else{
                        System.out.println(ans/2+1);
                    }
                }
                else{
                    System.out.println(0);
                }
            }

        }
    }


}

