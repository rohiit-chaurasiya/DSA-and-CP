import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;


public class KillDemodogs_CF
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

    static int numberOfPaths(int m, int n)
    {

        if (m == 1 || n == 1)
            return 1;

        return numberOfPaths(m - 1, n)
                + numberOfPaths(m, n - 1);
    }



    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            long mod=1000000007;
            if(test>=1 )
            {
                while(test>0) {
                    long lenn=in.nextInt();
                    if(lenn>=2) {
                        long resultF=2022;
//                        for(long i=1;i<lenn;i++)
//                        {
//                            resultF=(resultF+2022*((i+1)*(2*i+1)))%mod;
//
//                        }

//                        long seq=((lenn*(lenn+1)%mod*(2*lenn+1)%mod*2022%mod)*Math.pow(6,mod-2));
                        BigInteger result=BigInteger.valueOf(2022*(lenn*(lenn+1)*(4*lenn-1)/6)%mod);
                        System.out.println(result);

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


