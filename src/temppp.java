

/* package codechef; // don't place package name! */

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class temppp
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        if(test>=1 && test<=100000)
        {
            while(test>0)
            {
                long lenn=in.nextLong();
                long lenx=in.nextLong();


                if(lenn>=2 && lenn<=100000 )
                {
                    ArrayList<Long>arr1=new ArrayList<>();
                    long temp=0;
                    for(int i=0;i<lenn;i++)
                    {
                        arr1.add(in.nextLong());
                        if(arr1.get(i)%2==0)
                        {
                            temp++;
                        }
                    }
                    if(lenx%2!=0)
                    {
                        if(temp%2!=0)
                        {
                            System.out.println(temp/2+1);
                        }
                        else{
                            System.out.println(temp/2);
                        }
                    }
                }
                test--;
            }
        }
    }
}
