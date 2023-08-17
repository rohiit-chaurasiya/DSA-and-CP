import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayColoring {
    public static void main(String[] arg)
    {
        Scanner in =new Scanner(System.in);
        int kiet=in.nextInt();
        while(kiet-->0)
        {
            int len=in.nextInt();
            if(len>=2)
            {
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    arr.add(in.nextInt());
                }

                int cnto=0,cnte=0;
                for(int i=0;i<len;i++)
                {
                    if(arr.get(i)%2==0)
                    {
                        cnte+=1;
                    }
                    else{
                        cnto+=1;
                    }
                }
                if(cnto%2==0)
                {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

            }
        }
    }

}
