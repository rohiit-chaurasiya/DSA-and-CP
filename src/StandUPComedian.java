import java.util.*;
import java.lang.*;
import java.io.*;


public class StandUPComedian
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
                    long lena=in.nextLong();
                    long lenb=in.nextLong();
                    long lenc=in.nextLong();
                    long lend=in.nextLong();

                    if(lena+lenb+lenc+lend>=1) {
                        long tempb=lena;
                        long tempa=lena;
                        long tempj=lena;
                        long cnt=lena;
                        long tempp=0;

                        while(lenb>0 || lenc>0 || lend>0 )
                        {
                            if(tempb>0 && lenb>0) {
                                tempp = Math.min(lenb, tempb);
                                tempb -= tempp;
                                tempa += tempp;
                                tempj += tempp;
                                lenb -= tempp;
                            }
                            else if(tempa>0 && lenc>0)
                            {
                                tempp=Math.min(lenc,tempa);
                                tempa-=tempp;
                                tempb+=tempp;
                                tempj+=tempp;
                                lenc-=tempp;


                            }
                            else if(tempa>0 && tempb>0 && lend>0)
                            {
                                tempp=Math.min(lend,Math.min(tempa,tempb));
                                tempj+=tempp;
                                tempa-=tempp;
                                tempb-=tempb;
                                lend-=tempp;
                            }
                            else{
                                if(lenb!=0 || lenc!=0 || lend!=0)
                                {
                                    tempj+=1;

                                }
                                break;
                            }
                        }
                        System.out.println(tempj);








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


