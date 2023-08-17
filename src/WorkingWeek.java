import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class WorkingWeek
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
                int rlen=in.nextInt();

                ArrayList<Long>ele=new ArrayList<>();
                for(int i=0;i<rlen;i++)
                {
                    ele.add(in.nextLong());
                }

                if(rlen==1)
                {
                    System.out.println(0);
                }
                else {
                    long result = 0;
                    Collections.sort(ele);
//                    (ele.get(i) + 2 * ele.get(0) - 2) / (2 * ele.get(0) - 1)
                    for (int i = 1; i < rlen; i++) {
                        long diff1=(ele.get(i) + 2 * ele.get(0) - 2);
                        long diff2=(2 * ele.get(0)-1);
                        if ( diff1/diff2>1)
                        {
                            result += diff1/diff2-1;
                        }
                    }
                    System.out.println(result);
                }
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

