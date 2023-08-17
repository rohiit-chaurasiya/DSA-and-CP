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

class BurenkaPlayswithFractions
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

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int test=in.nextInt();
            while(test>0)
            {
                int N=in.nextInt();
                int M=in.nextInt();
                int X=in.nextInt();
                int Y=in.nextInt();
                int f1=N*Y;
                int f2=M*X;
                if(f1==f2)
                {
                    System.out.println('0');
                }
                else {
                    if(f2!=0 && f1%f2==0)
                    {
                        System.out.println('1');
                    }
                    else if(f1!=0 && f2%f1==0)
                    {
                        System.out.println('1');
                    }
                    else {
                        System.out.println('2');
                    }
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


