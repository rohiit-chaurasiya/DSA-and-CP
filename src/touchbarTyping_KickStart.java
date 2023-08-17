import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


public class touchbarTyping_KickStart
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

    public static int solve(int n,int[] str,int m,int[] keyboard){
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++){
            hm.put(keyboard[i],i);
        }
        int ans=0;
        int cur=hm.get(str[0]);
        for(int i=1;i<n;i++){
            int x=hm.get(str[i]);
            ans+=Math.abs(cur-x);
            cur=x;
        }
        return ans;
    }

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int tt=in.nextInt();
            for(int test=1;test<=tt;test++) {
                int n = in.nextInt();
                int[] str = new int[n];
                for (int i = 0; i < n; i++)
                    str[i] = in.nextInt();
                int m = in.nextInt();
                int[] keyboard = new int[m];
                for (int i = 0; i < m; i++)
                    keyboard[i] = in.nextInt();
                int ans = solve(n, str, m, keyboard);
                System.out.println("Case #" + test + ": " + ans);
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}
