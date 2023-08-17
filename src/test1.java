import java.util.Scanner;

import java.util.*;
public class test1
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        int l=0;
        int r=len-1;
        int mid=(l+r)/2;
        l=mid-1;
        String ans="";
        while(r>=mid)
        {
            int x=str.charAt(r)+1;
            if(str.charAt(r)=='z' || str.charAt(r)=='Z' )
            {
                if(x>'Z' && str.charAt(r)=='Z')
                {
                    x='A';
                }
                else{
                    x='a';
                }
            }
            ans=ans+(char)x;
            r--;
        }

        while(l>=0)
        {
            int y=str.charAt(l)+1;
            if(str.charAt(l)=='Z' || str.charAt(l)=='z')
            {
                if(y>'Z' && str.charAt(l)=='Z' )
                {
                    y='A';
                }
                else{
                    y='a';
                }
            }
            ans=ans+(char)(y);
            l--;
        }
        System.out.println(ans);

    }
}
