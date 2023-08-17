

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;


class ternary_matrix
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
            for(int i=0;i<x;i++)
            {
                for(int k=0;k<y;k++)
                {
                    int ka=i/2,kb=k/2;
                    int st1=(ka+kb)&1;
                    int st2=((i&1)+(k&1)&1);
//                    st2=st2&1;
                    System.out.print((st1^st2)+" ");
                }
                System.out.println();
            }
        }
    }
}
