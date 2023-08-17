
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chefDrinkTea
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int j=0;j<t;j++)
        {
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();
            if(y>x)
            {
                System.out.println(z);
            }
            else{
                int r=x/y;
                r=(r+x%y)*z;
                System.out.println(r);
            }
        }
    }
}
