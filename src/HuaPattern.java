import java.sql.SQLSyntaxErrorException;
import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-08/04/2023
public class HuaPattern
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
                    int lenn=in.nextInt();
                    long lenm=in.nextLong();

                    if(lenn>=1 && lenm>=0)
                    {
                        int arr[][]=new int[lenn][lenn];
                        for(int i=0;i<lenn;i++)
                        {
                            for(int j=0;j<lenn;j++)
                            {
                                arr[i][j]=in.nextInt();
                            }
                        }
                        int result=0;
                        for(int i=0;i<lenn;i++)
                        {
                            for(int j=0;j<lenn;j++)
                            {

                                if(arr[i][j]==arr[lenn-i-1][lenn-j-1])
                                {
                                    result+=1;
                                }
                            }
                        }
                        if(result>lenm)
                        {
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
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



