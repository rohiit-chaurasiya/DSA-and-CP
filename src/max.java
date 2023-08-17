import java.util.Scanner;

public class max {
    public static void main(String [] arg)
    {
//        int max=Integer.MIN_VALUE;
//        System.out.println(max);
        Scanner scan=new Scanner(System.in);
        int arr[]={1,2,2,3,4,5,3,1,8,9};
        int n=10;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            boolean isDistinct=true;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                {
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct)
            {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
