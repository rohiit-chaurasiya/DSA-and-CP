import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RudolfSnowflakes {

    public static boolean check(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            int temp=0;
            int cnt=1;
            while(cnt<=n)
            {
                if(cnt==n)
                {
                    return true;
                }
                temp+=1;
                cnt=cnt*i+1;
            }
        }
        return  false;
    }

    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            if(check(n)==true)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }
    }
}

