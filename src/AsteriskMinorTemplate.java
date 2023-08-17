import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-27/02/2023
public class AsteriskMinorTemplate
{
    static class FastkReader{
        BufferedReader br;
        StringTokenizer st;
        public FastkReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null || !st.hasMoreTokens())
            {
                try {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str="";
            try {
                str=br.readLine().trim();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastkWriter{
        private final BufferedWriter bw;
        public FastkWriter()
        {
            this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object)throws IOException{
            bw.append(""+object);
        }
        public void println(Object object)throws IOException{
            print(object);
            bw.append("\n");
        }
        public void close()throws IOException {
            bw.close();

        }

    }
    public static boolean position(ArrayList<Long> arr)
    {
        int len=arr.size();
        for(int i=0;i<len-1;i++)
        {
            if(arr.get(i)!=arr.get(i+1))
            {
                return  false;
            }
        }
        return  true;
    }

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=10000)
            {
                while(test>0) {
                    boolean flag=false;
                    String str1=in.next();
                    String str2=in.next();
                    int len1=str1.length();
                    int len2=str2.length();

                    if(len1>=1 && len2<=1)
                    {
                        if(str1.equals(str2))
                        {

                            System.out.println("YES");
                            System.out.println(str1);
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                    else {
                        if(str1.charAt(0)==str2.charAt(0) || str1.charAt(len1-1)==str2.charAt(len2-1))
                        {
                            flag=true;
                            System.out.println("YES");
                            if(str1.charAt(0)==str2.charAt(0))
                            {
                                System.out.println(str1.charAt(0)+"*");
                            }
                            else {
                                System.out.println("*"+str1.charAt(len1-1));
                            }
                        }
                        else if(flag==false) {
                            for(int i=0;i<len1;i++)
                            {
                                for(int j=0;j<len2;j++)
                                {
                                    if(str1.charAt(i)==str2.charAt(j))
                                    {
                                        if(i<len1-1 && j<len2-1)
                                        {
                                            if(str1.charAt(i+1)==str2.charAt(j+1))
                                            {
                                                flag=true;
                                                System.out.println("YES");
                                                System.out.println("*"+str1.charAt(i)+str2.charAt(i+1)+"*");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else if(flag==false)
                        {
                            System.out.println("NO");
                        }
                    }

                    test--;
                }
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}



