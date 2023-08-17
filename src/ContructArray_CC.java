

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ContructArray_CC
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        if(test>=1 && test<=1000)
        {
            while(test>0)
            {
                int lenx=in.nextInt();


                if(lenx>=2 && lenx<=100000)
                {
                    if((lenx&1)!=0)
                    {
                        System.out.println(-1);
                    }
                    else{
                        for(int i=0;i<(lenx-1)/2;i++)
                        {
                            System.out.print("2 -2 ");

                        }
                        System.out.println("2 1");
                    }
                }
                test--;

            }
        }
    }
}
