
import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-08/04/2023
public class HuaChess
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
    public static int solve(int a,int b)
    {
        return a;
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
                    int lenn=in.nextInt();
                    int lenm=in.nextInt();

                    if(lenn>=1 && lenm>=1)
                    {
                        int res=solve(lenn,lenm);
                        int rest=solve(lenn-res,lenm);
                        int reslt=solve(lenn,lenm-res);
                        int fr=0;
                        int lst=0;
                        if(res==rest)
                        {
                            fr=lenn-reslt;
                            lst=lenm-rest;
                        }
                        else{
                            fr=lenn-reslt;
                            lst=lenm-rest;
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



