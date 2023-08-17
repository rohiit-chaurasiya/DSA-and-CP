import java.util.Scanner;

public class hcl {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                 arr[i]=sc.nextInt();
            }

            boolean flag=true;
            for(int i=0;i<n-1;i++)
            {
                int x=arr[i];
                int y=arr[i+1];
                if((x%2==0 && y%2==0) || (x%2!=0 && y%2!=0) )
                {
                    flag=false;
                    break;
                }
                else {
                    continue;
                }

            }
            if(flag)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("No");
            }




            test--;
        }
    }
}
