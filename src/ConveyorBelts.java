import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-04/04/2023
public class ConveyorBelts
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
    public static long solve(long a,long b,long c)
    {
        a-=1;
        b-=1;
        a=Math.min(a,c-a-1);
        b=Math.min(b,c-b-1);
        long result= Math.min(a,b);
        return result;
    }
    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1)
            {
                while(test>0) {
                    long lenn=in.nextLong();
                    long lenx1=in.nextLong();
                    long leny1=in.nextLong();
                    long lenx2=in.nextLong();
                    long leny2=in.nextLong();
                    if(lenn>=1)
                    {
                        long res1=solve(lenx1,leny1,lenn);
                        long res2=solve(lenx2,leny2,lenn);
                        System.out.println(Math.abs(res1-res2));

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



