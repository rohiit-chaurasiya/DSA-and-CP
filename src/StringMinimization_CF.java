import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


public class StringMinimization_CF
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
                int opr=in.nextInt();
                int arr[]=new int[len];
                for(int i=0;i<len;i++)
                {
                    arr[i]=in.nextInt();
                }

                String B[]=new String[opr];
                Arrays.fill(B, "B");
                for(int i=0;i<len;i++)
                {
                    int a= Math.min(arr[i],opr+1-arr[i]);
                    int b= Math.max(arr[i],opr+1-arr[i]);
                    String mt="A";
                    String mt2=B[a-1];

                    if(mt2.equals(mt))
                    {

                        B[b-1]="A";
                    }
                    else {
                        B[a-1]="A";
                    }
                }
                for(int i=0;i<B.length;i++)
                {
                    System.out.print(B[i]);
                }
                System.out.println();

            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

