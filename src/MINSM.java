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

class MINSM
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
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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
                ArrayList<Integer> arr=new ArrayList<>();
                for(long i=0;i<len;i++)
                {
                    arr.add(in.nextInt());
                }
                long gcd=0;
                for(int i=0;i<len;i++)
                {
                    gcd=gcd(gcd,arr.get(i));
                }
                long ans=gcd*len;
                System.out.println(ans);




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

