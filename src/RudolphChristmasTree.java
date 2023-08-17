import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RudolphChristmasTree {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int b=in.nextInt();
            int h=in.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr.add(in.nextInt());
            }
            Collections.sort(arr);
            double result=0;
            for(int i=0;i<n-1;i++)
            {
                int diff=arr.get(i+1)-arr.get(i);
                double temp=0;
                if(diff<h)
                {
                    temp=((h-diff)*1.0)*((h-diff)*1.0)*(b*1.0)/(2*h*1.0);
                }
                result+=(b*h*1.0)/(2*1.0);
                result-=temp;

            }
            result+=(b*h*1.0)/(2*1.0);
            System.out.println(result);



        }
    }
}
