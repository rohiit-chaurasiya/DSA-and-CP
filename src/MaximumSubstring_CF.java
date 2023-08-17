import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.*;


public class MaximumSubstring_CF
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
            if(test>=1)
            {
                while(test>0) {
                    int nlen = in.nextInt();
//                    if (nlen>=1)
//                    {
                        char bstr[]=in.next().toCharArray();
                        int ff=0,ss=0;

                        for(int i=0;i<nlen;i++)
                        {

                            if(bstr[i]=='0')
                            {
                                ss++;
                            }
                            else {
                                ff++;
                            }
                        }
                        int xmm=Math.max(ff*ss,Math.max(ss*ss,ff*ff));

                        System.out.println(xmm);

//                    }
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


