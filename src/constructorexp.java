import java.util.Scanner;

public class constructorexp {
    int a;

    //default constructor
    constructorexp()
    {
        System.out.println("Default Constructor call here");
    }

    constructorexp(int a)
    {
        System.out.println("Parameterrized constructor value: "+a);
    }
    public static void main(String [] ARG)
    {
        Scanner scan =new Scanner(System.in);
        int b=scan.nextInt();
        constructorexp ob=new constructorexp(b);
        constructorexp ob1=new constructorexp();
//        System.out.println(ob.a);
    }

}
