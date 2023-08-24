import java.util.ArrayList;
import java.util.Scanner;

public class GiftCarpet_CF {
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int kiet=in.nextInt();
        if(kiet>=1)
        {
            while(kiet-->0)
            {
                int lenn=in.nextInt();
                int lenm=in.nextInt();

                if(lenn>=1)
                {
                    ArrayList<String>arr=new ArrayList<>();
                    for(int i=0;i<lenn;i++)
                    {
                        arr.add(in.next());
                    }

                    int cnt=0;
                    String temp="vika";
                    int cn=0;
                    int c=0;

                    for(int j=0;j<lenm;j++)
                    {
                        for(int k=0;k<lenn;k++)
                        {
                            String str1=arr.get(k);
                            char ch=str1.charAt(j);
                            if(ch==temp.charAt(cn))
                            {
                                cn+=1;
                                c+=1;
                                break;
                            }
                        }
                        if(c==4)
                        {
                            break;
                        }
                    }

                    if(c==4)
                    {
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }

                }

            }
        }
    }
}
