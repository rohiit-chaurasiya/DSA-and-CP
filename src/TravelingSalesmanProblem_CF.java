import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.math.*;
import static java.lang.Math.abs;



public class TravelingSalesmanProblem_CF
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
    public static int result(int a)
    {
        int temp=a;
        return 2*temp;
    }

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int tt=in.nextInt();
            for(int t=0;t<tt;t++)
            {

                int len=in.nextInt();
                int maxiA=0;//Integer.MAX_VALUE;
                int maxiB=0;//Integer.MAX_VALUE;
                int temp=0;
                int miniA=0;//Integer.MIN_VALUE;
                int miniB=0;//Integer.MIN_VALUE;
                for(int j=0;j<len;j++)
                {
                    int fir,sec;
                    fir=in.nextInt();
                    sec=in.nextInt();

                    maxiB=Math.max(maxiB,sec);
                    miniB=Math.min(miniB,sec);
                    maxiA=Math.max(maxiA,fir);
                    miniA=Math.min(miniA,fir);

                }
                int resA=maxiA-miniA;
                int resB=maxiB-miniB;
                int finalOut=resA+resB;
                int showo=result(finalOut);
                System.out.println(showo);

            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

