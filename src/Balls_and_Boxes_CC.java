import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Balls_and_Boxes_CC
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

    static boolean check(int a,int b)
    {
        if(a>=b)
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
                int A=in.nextInt();
                int B=in.nextInt();
                int cnt=B+1;
                B=(B*(cnt))/2;
                if(check(A,B))
                {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }


                test--;
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

