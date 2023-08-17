import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubtractionGame {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=101) {
            while (t-- > 0) {
                int n = in.nextInt();
                int m = in.nextInt();
                if(n>=1 && m>=1)
                {
                    System.out.println(n+m);
                }

            }
        }
    }
}
