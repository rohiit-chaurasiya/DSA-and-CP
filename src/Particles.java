import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Particles {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=100001) {
            while (t-- > 0) {
                int n = in.nextInt();
                if(n>=1)
                {
                    int comp=Integer.MIN_VALUE;
                    long max=Long.MIN_VALUE;
                    long[] arr=new long[n];
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=in.nextLong();
                        max = (max > arr[i]) ? max : arr[i];

                    }
                    if(max<=0)
                    {
                        System.out.println(max);
                    }
                    else{
                        long result=max;
                        long add=0L;
                        for(int i=0;i<n;i+=2)
                        {
                            if(arr[i]>=0)
                            {
                                add+=arr[i];

                            }

                        }
                        result = (result > add) ? result : add;
                        add=0;
                        for(int i=1;i<n;i+=2)
                        {
                            if(arr[i]>=0)
                            {
                                add+=arr[i];

                            }

                        }
//                        long finalre=(result = (result > add) ? result : add);
                        System.out.println(result = (result > add) ? result : add);


                    }
                }

            }
        }
    }
}
