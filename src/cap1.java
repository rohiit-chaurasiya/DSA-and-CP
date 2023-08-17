import java.util.ArrayList;
import java.util.Scanner;

public class cap1 {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
            int len=sc.nextInt();
            ArrayList<String>arr=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                arr.add(sc.next());
            }
            int cnt = 0;
            for(int i=0;i<len;i++) {
                String str = arr.get(i);
                String str1 = "";
                String str2 = "";
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == 'a')
                        str1 += str.charAt(j);
                    else if(str.charAt(j) == 'b'){
                        str2 += str.charAt(j);
                    }

                }
                if (str1.length() + str2.length() == str.length()) {
                    cnt += 1;
                }
            }

            System.out.println(cnt);
    }
}
