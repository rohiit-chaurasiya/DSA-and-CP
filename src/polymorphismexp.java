import java.util.Scanner;

public class polymorphismexp {
    //Method overloading/Early Binding/Compile Time/Static
    // -Not change return type

    //Method Overriding/Late Binding/Run Time/Dynamic

    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(float a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        float d=scan.nextFloat();
        polymorphismexp overloading=new polymorphismexp();
        overloading.sum(a,b,c);
        overloading.sum(a,b);
        overloading.sum(d,a);
    }
}
