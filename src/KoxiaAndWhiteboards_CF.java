import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;


public class KoxiaAndWhiteboards_CF
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
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    int lenb=in.nextInt();

                    if(lena>=1 && lena<=100 && lenb>=1 && lenb<=100 ) {
                        ArrayList<Long> arrA=new ArrayList<>();
                        ArrayList<Long>arrB=new ArrayList<>();
                        PriorityQueue<Long>queueP=new PriorityQueue<>();

                        for(int i=0;i<lena;i++)
                        {
                            arrA.add(in.nextLong());

                        }
                        for(int i=0;i<lena;i++)
                        {
                            queueP.add(arrA.get(i));
                        }
                        for(int i=0;i<lenb;i++)
                        {
                            arrB.add(in.nextLong());
                        }

                        for(int i=0;i<arrB.size();i++)
                        {
                            long temp=queueP.remove();
                            queueP.add(arrB.get(i));
                        }
                        long resultT=0;
                        while(queueP.size()>0)
                        {
                            long tempp=queueP.remove();
                            resultT+=tempp;
                        }

                        System.out.println(resultT);



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


