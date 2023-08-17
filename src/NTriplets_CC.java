import java.util.*;
import java.lang.*;
import java.io.*;


public class NTriplets_CC
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
//    public static rec()
    public static  boolean solveP(long it)
    {
        if(it<=1)
        {
            return false;
        }
        if(it==2 || it==3)
        {
            return true;
        }
        if(it%2==0 || it%3==0)
        {
            return  false;
        }
        for(int i=5;i<=Math.sqrt(it);i=i+6)
        {
            if(it%i==0 || it%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=100)
            {
                while(test>0) {
                    long lena=in.nextLong();

                    if(lena>=1 && lena<=1000000000) {

                        boolean resultF=solveP(lena);
                        if(resultF)
                        {
                            System.out.println(-1);
                        }else{
                            int j=2;
                            for(;j<lena;j++)
                            {
                                if(lena%j==0)
                                {
                                    System.out.println(" "+j+" "+lena/j);
                                }
                            }
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


