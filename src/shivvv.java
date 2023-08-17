import java.util.*;
class shivvv {
    public static int findNumberOfDigits(long n, int base)
    {
        int dig = (int)(Math.floor(Math.log(n) / Math.log(base)) + 1);
        return dig;
    }
    public static void main(String[] args)
    {
        long n = 4;
        int base = 2;
        int ans=0;
        for(long i=1;i<n;i++)
        {
            ans+=findNumberOfDigits(n, base);
        }
        if(base%2!=0) {
            System.out.println(ans + 1);
        }
        else
        {
            System.out.println(ans);
        }

    }
}
