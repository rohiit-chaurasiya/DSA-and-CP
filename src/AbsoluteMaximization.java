import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;


public class AbsoluteMaximization
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
                        if(test>=1 && test<=128)
                        {
                                while(test>0) {
                                        int lenn=in.nextInt();
                                        if(lenn>=3 && lenn<=512)
                                        {
                                                ArrayList<Integer>arr=new ArrayList<>();
                                                for(int i=0;i<lenn;i++)
                                                {
                                                        arr.add(in.nextInt());
                                                }

                                                int mixNum=arr.get(0);
                                                int minNum=arr.get(0);

                                                for(int i=1;i<lenn;i++)
                                                {
                                                        mixNum=mixNum | arr.get(i);
                                                        minNum=minNum & arr.get(i);
                                                }

                                                System.out.println(mixNum-minNum);
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



