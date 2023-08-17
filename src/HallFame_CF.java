import java.util.*;
import java.lang.*;
import java.io.*;


public class HallFame_CF
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
                    int lena=in.nextInt();

                    if(lena>=2 && lena<=100000) {
                        String str1=in.next();

                        int lenb=-1;
                        int lenc=-1;

                        int resultF=0;
                        for(int i=1;i<lena;i++)
                        {
                            if(str1.charAt(i-1)=='R' && str1.charAt(i)=='L')
                            {

                                lenb=i;

                            }
                            if(str1.charAt(i-1)=='L' && str1.charAt(i)=='R')
                            {
                                lenc=i;

                            }
                        }
                       if(lenb==-1 && lenc==-1)
                       {
                           System.out.println(-1);
                       }
                       else{
                           if(lenb>=0)
                           {
                               System.out.println(0);
                           }
                           else{
                               System.out.println(lenc);
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


