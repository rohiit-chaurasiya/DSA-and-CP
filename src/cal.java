import java.util.Scanner;

public class cal {
    public static  void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,ch;
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        System.out.println("Enter Choice: 1-Add\t2-Sub\t3-Mult\t4-Div\n");
        ch=sc.nextInt();
        switch (ch){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
        }

    }

}
