import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Permutation_Clear_CC
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

    static boolean check(int a,int b)
    {
        if(a>=b)
        {
            return true;
        }
        return false;
    }

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int test=in.nextInt();

            while(test>0)
            {
                int len=in.nextInt();
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    arr.add(in.nextInt());
                }

                int len2=in.nextInt();
                ArrayList<Integer>arr2=new ArrayList<>();
                for(int i=0;i<len2;i++)
                {
                    arr2.add(in.nextInt());
                }

                Map<Integer,Integer>map=new HashMap<>();
                for(int i=0;i<len2;i++)
                {


                        map.put(arr2.get(i),1);

                }
                int k=0;
                for (int i=0;i<len;i++)
                {
                    if(map.containsKey(arr.get(i)))
                    {
                        continue;
                    }
                    else {
                        System.out.print(arr.get(i)+" ");
                    }

                }
                System.out.println();

                test--;
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

