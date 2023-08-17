import java.util.*;
import java.lang.*;
import java.io.*;

class numc
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=100001) {
            while (t-->0) {
                int n = in.nextInt();
                if(n>=1)
                {
                    String str=in.next();
                    Map<Character,Integer>mp=new HashMap<>();
                    for(int i=0;i<str.length();i++)
                    {
                        if(mp.containsKey(str.charAt(i)))
                        {
                            mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
                        }
                        else{
                            mp.put(str.charAt(i),1);
                        }
                    }
                    int flag=0;
                    for(Map.Entry<Character,Integer>e:mp.entrySet())
                    {
                        if(e.getValue()>1)
                        {
                            flag=1;
                        }

                    }
                    if(flag==1)
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

