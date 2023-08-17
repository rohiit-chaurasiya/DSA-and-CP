import java.util.Scanner;

public class GAS {
    public static void  main(String ar[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gas[]=new int[n];
        int cost[]=new int[n];
        for(int i=0;i<n;i++)
        {
            gas[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            cost[i]=sc.nextInt();
        }
        int count = 0;
        boolean flag=false;
        for (int i = 0; i < gas.length; i += count) {
            int remainder = 0;
            count = 0;
            while (count < gas.length) {
                int idx = (i + count) % gas.length;
                remainder += gas[idx] - cost[idx];
                count++;
                if (remainder < 0) {
                    break;
                }
            }
            if (remainder >= 0) {
                flag=true;
                System.out.println(i);
            }
        }
        if(flag==false)
        {
            System.out.println(-1);
        }
    }
}

