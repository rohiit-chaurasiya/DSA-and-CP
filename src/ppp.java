import java.util.Scanner;
public class  ppp
{


    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=n*2-1;
        int z=n-1;
        int y=2;
        boolean flag=false;
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(j==i || j==k-i+1)
                {

                    if(flag==false)
                    {
                        System.out.print(i);
                    }
                    else {
                        System.out.print(i-y);
                    }
                    if(i==n)
                    {
                        flag=true;
                    }


                }
                System.out.print(" ");



            }
            System.out.println();
            if(i>n)
            {
                y+=2;
            }


        }

    }
}