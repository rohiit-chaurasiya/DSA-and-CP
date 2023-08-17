import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-08/04/2023
public class HuaMaze
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
                    long lenn=in.nextLong();
                    long lenm=in.nextLong();

                    if(lenn>=4)
                    {
                        long lenx1=in.nextLong();
                        long leny1=in.nextLong();
                        long lenx2=in.nextLong();
                        long leny2=in.nextLong();
                        int fr=0;
                        if((lenx1==1 || lenx1==lenn) && (leny1==1 || leny1==lenm) || (lenx2==1 || lenx2==lenn) && (leny2==1 || leny2==lenm) )
                        {
                            fr=2;
                        }
                        else if(lenx1==1 || lenx1==lenn || leny1==1 || leny1==lenm || lenx2==1 || lenx2==lenn || leny2==1 || leny2==lenm )
                        {
                            fr=3;
                        }
                        else{
                            fr=4;
                        }
                        System.out.println(fr);

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



