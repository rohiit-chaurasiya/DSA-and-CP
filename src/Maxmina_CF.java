import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Maxmina_CF
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
                int alen=in.nextInt();
                int blen=in.nextInt();
                if(alen>=2 && blen>=2 && alen<=50 && blen<=50) {
                    ArrayList<Integer> arr1 = new ArrayList<>();
                    for (int i = 1; i <= alen; i++) {
                        arr1.add(in.nextInt());
                    }
                    int res = 0;
                    for (int i = 0; i < alen; i++) {
                        res += arr1.get(i);
                    }
                    boolean flag = false;
                    if (blen == 1) {
                        if (res == alen) {
                            flag = true;
                            System.out.println("YES");

                        }
                    } else {
                        if (res > 0) {
                            flag = true;
                            System.out.println("YES");
                        }
                    }
                    if (!flag) {
                        System.out.println("NO");
                    }
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

