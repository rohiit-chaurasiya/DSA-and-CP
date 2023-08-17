
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Relational_Operators
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
            if(x<y)
            {
                System.out.println("<");
            }
            else if(x==y)
            {
                System.out.println("=");
            }
            else{
                System.out.println(">");
            }

        }
    }
}

