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

class Crossmarket
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
    static boolean check(long a,long b)
    {
        if(a>b)
        {
            return true;

        }
        return false;
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
                long len=in.nextInt();
                long m=in.nextInt();
                if(len==1 && m==1)
                {
                    System.out.println(0);
                    continue;
                }
                if(check(m,len))
                {
                    long t=(len-1)+len+(m-1);
                    System.out.println(t);
                }
                else {
                    long q=(m-1)+m+(len-1);
                    System.out.println(q);
                }

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


