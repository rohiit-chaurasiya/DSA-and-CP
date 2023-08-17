import java.util.ArrayList;
import java.util.Scanner;

public class MyCritics {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1) {
            while (t-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
