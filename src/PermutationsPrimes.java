import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutationsPrimes {
    public static void solve(int a)
    {
        if(a==1)
        {
            System.out.println(1);
            return;
        }
        if(a==2)
        {
            System.out.println(2+" "+1);
            return;
        }
        int[] arr=new int[a];
        arr[0]=3;
        arr[a-1]=2;
        arr[a/2]=1;
        int temp=4;
        for(int i=1;i<a-1;i++)
        {
            if(i==a/2)
            {
                continue;
            }
            arr[i]=temp;
            temp+=1;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;


    }
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=10001) {
            while (t-- > 0) {
                int n = in.nextInt();
                if(n>=1)
                {
                    solve(n);


                }

            }
        }
    }
}
