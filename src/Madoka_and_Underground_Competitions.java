import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Madoka_and_Underground_Competitions
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

    static boolean check(int a,int b,int c )
    {
        if(a+b==c)
        {
            return true;
        }
        return false;
    }

    static boolean checkSum(int a,int b,int c,int d )
    {
        if(Math.abs(a+b-c)%d==0)
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
                int len=in.nextInt();
                int k=in.nextInt();
                int p=in.nextInt();
                int q=in.nextInt();
                char arr[][]=new char[501][501];

                for(int i=1;i<=len;++i)
                {
                    for(int j=1;j<=len;++j)
                    {
                        arr[i][j]='.';
                    }
                }

                for(int i=2;i<=len*2;++i)
                {
                    if(Math.abs(p+q-i)%k==0)
                    {
                        for(int j=1;j<=len;++j)
                        {
                            for(int m=1;m<=len;++m)
                            {
                                if(check(j,m,i))
                                {
                                    arr[i][j]='X';
                                }
                            }
                        }
                    }
                }

                for(int i=1;i<=len;++i)
                {
                    for(int j=1;j<=len;++j)
                    {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
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

