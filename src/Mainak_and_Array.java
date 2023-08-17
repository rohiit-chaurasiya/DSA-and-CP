import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Mainak_and_Array
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

    static boolean check(int a)
    {
        if(a%2==0)
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
                int max1=Integer.MIN_VALUE;
                int min1=Integer.MAX_VALUE;

                for(int i=0;i<len;i++)
                {
                    max1=Math.max(max1,arr.get(i));
                }

                ArrayList<Integer>res=new ArrayList<>();
                res.add(max1-arr.get(0));
                for(int i=0;i<len-1;i++)
                {
                    min1=Math.min(min1,arr.get(i));
                }

                res.add(arr.get(len-1)-min1);
                for(int i=0;i<len-1;i++)
                {
                    res.add(arr.get(i)-arr.get(i+1));
                }

                res.add(arr.get(len-1)-arr.get(0));
                Collections.sort(res);
                System.out.println(res.get(res.size()-1));



//                if(len==1)
//                {
//                    System.out.println(0);
//                }
//                else {
//
//                    Collections.sort(arr);
//                    int res = arr.get(arr.size() - 1) - arr.get(0);
//                    System.out.println(res);
//                }

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

