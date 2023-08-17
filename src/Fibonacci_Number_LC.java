import javax.print.attribute.standard.PresentationDirection;

public class Fibonacci_Number_LC {
    static int fibb(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
            return 1;

        return fibb(n-1)+fibb(n-2);

    }
    public static void main(String[] arg)
    {
        int n=30;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibb(i)+" ");
        }

    }
}
