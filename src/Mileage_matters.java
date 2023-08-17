import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.math.*;


public class Mileage_matters
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
                int Pp=in.nextInt();
                int Dp=in.nextInt();
                int Ac=in.nextInt();
                int Bc=in.nextInt();

                int ptm=len%Ac;
                long fi=((len/Ac)*Pp);
                long hf=Pp/2;
                if(ptm>0 && ptm<=Ac/2)
                {
                    fi=((len/Ac)*Pp)+(hf);
                }
                else if(ptm>0) {
                    fi=((len/Ac)*Pp)+Pp;

                }

                int dtm=len%Bc;
                long fii=((len/Bc)*Dp);
                long hg=Dp/2;
                if(dtm!=0 && dtm<=Dp/2)
                {
                    fii=((len/Bc)*Dp)+(hg);
                }
                else if(dtm>0) {
                    fii=((len/Bc)*Dp)+Dp;

                }



                if(fi>fii)
                {
                    System.out.println("DIESEL");
                }
                else if(fi==fii)
                {
                    System.out.println("ANY");
                }
                else {
                    System.out.println("PETROL");
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

