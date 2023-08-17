import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.math.*;
import static java.lang.Math.abs;

class FlippingFailure
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
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
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter()
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
    static int a1[]=new int[100001];
    static int b1[]=new int[100001];

    static int solve(int a,int b)
    {
        return b1[b]-b1[a-1];
    }
    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int test=in.nextInt();
            while(test>0)
            {
                String str=in.next();

                for(int i=0;i<str.length();i++)
                {
                    a1[i+1]=str.charAt(i)-48;
                }

                int len=str.length();
                int s=2147483647;
                for(int i=1;i<=len;++i)
                {
                    b1[i]=b1[i-1]+a1[i];
                }
                int m=solve(1,len);
                for(int i=1;i<=len;++i)
                {
                    if(len-i-solve(i+1,len)>solve(1,i))
                    {
                        continue;
                    }
                    s=Math.min(s,len-i-solve(i+1,len)+solve(1,i)-(len-i-solve(i+1,len))-solve(1,solve(1,i)-(len-i-solve(i+1,len))));
                }
                System.out.println(s);






                test-=1;
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }
    }
}


