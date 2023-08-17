public class Recursion_Sum_of_natural_number {
    public static int solve(int n)
    {
        int s=0;
        if(n==1)
            return 1;

        s=n+solve(n-1);
        return s;
    }

    public static void main(String[] arg)
    {
        int k=3;
        int ans=solve(k);
        System.out.println(ans);
    }
}
