import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;


class three_XOR
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int j=0;j<t;j++)
        {
            int x=scan.nextInt();
            int check=x&1;
            if(check>0)
            {
                System.out.println(-1);
            }
            else {
                x/=2;
                int b,c;
                b=1;
                c=x^b;
                System.out.println(b+" "+b+" "+c);
            }
        }
    }
}
