import java.util.Scanner;
import java.util.*;
public class WordPaper {


    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = in.nextInt();
        if (t >= 1) {
            while (t-->0) {
                char ch=' ';
                String str="";
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++)
                    {
                        ch=in.next().charAt(0);
                        if(ch!='.')
                        {
                            str+=ch;
                        }
                    }
                }
                System.out.println(str);
            }
        }
    }
}
