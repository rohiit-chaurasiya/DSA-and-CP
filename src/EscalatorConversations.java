import java.util.ArrayList;
import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int h = in.nextInt();
            if (n >= 1) {
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<n;i++)
                {
                    arr.add(in.nextInt());
                }
                int result=0;
                for(int i=0;i<n;i++)
                {
                    if(arr.get(i)+h>=m*k)
                    {
                        result+=1;
                    }
                }
                System.out.println(result);

            }
        }
    }



}
