import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;

import java.math.*;
import static java.lang.Math.abs;
import static java.lang.System.*;

class InterestingSum
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
        return a-b;
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
                int len=in.nextInt();
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    arr.add(in.nextInt());

                }
                ArrayList<Integer>ans=new ArrayList<>(arr);
                Collections.sort(ans);
                int l=ans.get(len-1)+ans.get(len-2);
                int m=solve(l,ans.get(0));
                System.out.println(m-ans.get(1));

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


