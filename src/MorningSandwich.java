import java.util.Scanner;

public class MorningSandwich {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int b = in.nextInt();
            int c = in.nextInt();
            int h = in.nextInt();
            if (b >= 2)
            {
                int temp=c+h;

                int result=0;
                if(temp>=b)
                {
                    result=2*b-1;
                    System.out.println(result);
                }
                else{
                    result=2*temp+1;
                    System.out.println(result);
                }
            }
        }
    }

}
