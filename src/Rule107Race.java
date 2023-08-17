
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rule107Race
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=scan.nextInt();
            int y=scan.nextInt();
            float rule=(float)(x*107)/100;
            if(y>rule)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}
