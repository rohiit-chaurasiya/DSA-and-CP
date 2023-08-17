import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Sending_a_Sequence_Over_the_Network_CF
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

            int test=in.nextInt();
            int t=0;
            while(test>0)
            {
                int nlen=in.nextInt();
                ArrayList<Integer>arr1=new ArrayList<>();
                for(int i=1;i<=nlen;i++)
                {
                    arr1.add(in.nextInt());
                }
                boolean cnt[]=new boolean[nlen+1];
                cnt[0]=true;
                for(int i=1;i<=nlen;i++)
                {
                    if(i+arr1.get(i)<=nlen && cnt[i-1])
                    {
                        cnt[i]=true;
                        cnt[i+arr1.get(i)]=true;
                    }
                    if(i-arr1.get(i)>=1 && cnt[i-arr1.get(i)-1])
                    {
                        cnt[i]=true;
                    }
                }

                if(cnt[nlen])
                {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
//                System.out.println("hh");



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

