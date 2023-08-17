public class Power_of_Two_Recursion {
    static int calculate(int a,int b)
    {
        if(b==0)
            return 1;
        if(b==1)
            return a;

        int ans=calculate(a,b/2);

        if(b%2==0)
            return ans*ans;
        else
            return a*ans*ans;

    }
    public static void main(String[] arg)
    {
        int a=2,b=6;
        System.out.println(calculate(a,b));
    }
}
