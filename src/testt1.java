import java.util.Scanner;

public class testt1 {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char ch=in.next().charAt(0);
        String ans="";

        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            if(curr!=ch && curr!=ch)
            {
                ans+=curr;
            }
        }
        System.out.println(ans);
    }
}
