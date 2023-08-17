import java.util.Scanner;

public class MaximumRounding {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if(kiet>=1) {
            while (kiet-- > 0)
            {
                int len = in.nextInt();
                StringBuilder s = new StringBuilder();
                s.append(len);
                s.reverse();
                s.append('0');
                int temp=0;
                for(int i=0;i<s.length()-1;i++)
                {
                    if(s.charAt(i)>'4')
                    {
                        ;
                    }
                }



            }
        }
    }
}
