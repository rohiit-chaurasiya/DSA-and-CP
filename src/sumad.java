/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumad
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int j=0;j<n;j++)
            {
                arr[i]=scan.nextInt();
                sum+=arr[i];
            }
            if(sum%2==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
