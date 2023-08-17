import java.util.*;
import java.lang.*;
import java.io.*;


public class ParallelProjection_CF
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

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=10000)
            {
                while(test>0) {
                    int lenw=in.nextInt();
                    int lend=in.nextInt();
                    int lenh=in.nextInt();

                    if(lenw>=2 && lenw<=1000 && lend>=2 && lend<=1000 && lenh>=2 && lenh<=1000) {
                        int lena=in.nextInt();
                        int lenb=in.nextInt();
                        int lenf=in.nextInt();
                        int leng=in.nextInt();
                        if(lena>0 && lena<lenw && lenf>0 && lenf<lenw && lenb>0 && lenb<lend && leng>0 && leng<lend)
                        {

//                            int temp=lenw-lena;
//                            temp+=lenw-lenf;
//                            temp+=lenh;
//                            temp+=Math.abs(lenb-leng);
//                            int tempp=lena+lenh+lenf+Math.abs(lenb-leng);
//                            int res=Math.min(temp,tempp);
//                            int fres=(lenb-lend)+(lend-leng)+lenh+Math.abs(lena-lenf);
//                            int op=lenb+leng+lenh+Math.abs(lena-lenf);
//                            int ress=Math.min(fres,op);
//                            int opp=Math.min(res,ress);
                            int temp=Integer.MAX_VALUE;
                            temp=Math.min(temp,Math.abs(lenb-leng)+Math.abs(lenw-lenf)+Math.abs(lenw-lena));
                            temp=Math.min(temp,Math.abs(lenb-leng)+Math.abs(0-lenf)+Math.abs(0-lena));
                            temp=Math.min(temp,Math.abs(lena-lenf)+Math.abs(0-lenb)+Math.abs(0-leng));
                            temp=Math.min(temp,Math.abs(lena-lenf)+Math.abs(lend-lenb)+Math.abs(lend-leng));
                            temp+=lenh;

                            System.out.println(temp);
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


