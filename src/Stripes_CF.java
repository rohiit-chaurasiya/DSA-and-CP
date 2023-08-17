import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Stripes_CF
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
                String arr[]=new String[8];
                int rr=0,b=0;
                for(int i=0;i<8;i++)
                {
                    arr[i]=in.next();
                }

                for(int i=0;i<8;i++)
                {
                    String st=arr[i];
                    for(int j=0;j<st.length();j++)
                    {
                        if(st.charAt(j)=='R')
                        {
                            rr++;
                        }
                        else if(st.charAt(j)=='B') {
                            b++;
                        }
                    }
                }

                if(b>=rr)
                {
                    System.out.println("B");
                }
                else {
                    System.out.println("R");
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

