import java.util.Scanner;

public class fac {
    public static int factorial(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else {
            return (a*factorial(a-1));
        }
    }
    public static void main(String[] srg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
//        fac c =new  fac();
        int res=factorial(n);
        System.out.println(res);
    }
}
