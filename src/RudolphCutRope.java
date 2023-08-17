import java.util.Scanner;

public class RudolphCutRope {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n=in.nextInt();
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                int a=in.nextInt();
                int b=in.nextInt();
                if(a>b)
                {
                    cnt+=1;
                }

            }
            System.out.println(cnt);
        }
    }
}
