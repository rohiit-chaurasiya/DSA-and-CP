
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class complementry_string
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int j=0;j<t;j++)
        {
            int l=scan.nextInt();
            char s[]=new char[l];
            for(int k=0;k<l;k++)
            {
                s[k]=scan.next().charAt(0);
            }
            char res[]=new char[l];
            for(int i=0;i<l;i++)
            {
                if(s[i]=='A')
                    res[i]='T';

                if(s[i]=='T')
                    res[i]='A';

                if(s[i]=='C')
                    res[i]='G';

                if(s[i]=='G')
                    res[i]='C';
            }
            System.out.println(s);
        }
    }
}

