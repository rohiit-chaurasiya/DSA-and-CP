import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Sum_CF
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

            int test=in.nextInt();
            int t=0;
            while(test>0)
            {
                int alen=in.nextInt();
                int blen=in.nextInt();
                int clen=in.nextInt();
                if(alen>=0 && blen>=0 && alen<=20 && blen<=20 && clen>=0 && clen<=20) {
                    if(alen+blen==clen)
                    {
                        System.out.println("YES");
                    }
                    else if(blen+clen==alen)
                    {
                        System.out.println("YES");
                    }
                    else if(alen+clen==blen)
                    {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }

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

