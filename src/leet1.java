import java.lang.String;
import java.util.Scanner;

public class leet1 {
    public static void main(String[] arg)
    {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,z;
            n=scan.nextInt();
            z=scan.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=scan.nextInt();

            }
            int max=0;
            int an;
            for(int k=0;k<n;k++)
            {
                an=arr[k] | z;
                if(an>max)
                {
                    max=an;
                }
            }
            System.out.println(max);
        }
    }
}
