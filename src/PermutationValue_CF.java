import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.*;


class PermutationValue_CF
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
            if(test>=1 && test<=48)
            {
                while(test>0) {
                    int nlen = in.nextInt();
                    if (nlen >= 3 && nlen <= 50)
                    {
                        ArrayList<Integer>result=new ArrayList<>();
                        for(int i=1;i<=nlen;i++)
                        {
                            if(i%2!=0)
                            {
                                result.add(i);
                            }
                        }
                        for(int i=nlen;i>=1;i--)
                        {
                            if(!result.contains(i))
                            {
                                if(i%2==0)
                                {
                                    result.add(i);
                                }
                            }
                        }

                        for(int i=0;i<result.size();i++)
                        {
                            System.out.print(result.get(i)+" ");
                        }
                        System.out.println();

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


