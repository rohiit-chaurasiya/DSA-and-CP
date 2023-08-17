import java.util.*;
import java.lang.*;
import java.io.*;


public class ConstructiveForcesTask_CF
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
            if(test>=1 && test<=100)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    if(lena>=2 && lena<=1000) {
                        if(lena==3)
                        {
                            System.out.println("NO");
                        }
                        if(lena%2==1)
                        {
                            System.out.println("YES");
                            int cnt=lena/2;
                            for(int i=0;i<lena/2;i++)
                            {
                                System.out.print(cnt-1+" "+-cnt+" ");
                            }
                            System.out.print(cnt-1);
                            System.out.println();


                        }
                        else{
                            System.out.println("YES");
                            for(int i=0;i<lena;i++)
                            {
                                if(i%2==0)
                                {
                                    System.out.print(1+" ");
                                }
                                else if(i%2==1)
                                {
                                    System.out.print(-1+" ");
                                }
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


