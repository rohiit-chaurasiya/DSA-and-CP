
import java.io.*;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


public class info1
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

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int n=in.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr.add(in.nextInt());
            }
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(arr.get(i)))
                    map.put(arr.get(i),map.get(arr.get(i))+1);
                else
                    map.put(arr.get(i),1);
            }
            int len=map.size();
            Collections.sort(arr);

            int min=Integer.MIN_VALUE;
            int cnt=0;
            for(Map.Entry<Integer,Integer>e:map.entrySet())
            {

            }
            System.out.println(cnt);










            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

