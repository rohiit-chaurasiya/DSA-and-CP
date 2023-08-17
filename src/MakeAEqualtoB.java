import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class MakeAEqualtoB
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
        if(a!=b)
        {
            return false;
        }
        return true;
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

                    ArrayList<Integer> arr1 = new ArrayList<>();
                    ArrayList<Integer> arr2 = new ArrayList<>();
                    int f = 0, g = 0;
                    int ch=0;
                    for (int i = 0; i < nlen; i++) {
                        arr1.add(in.nextInt());
                        if (arr1.get(i) == 0) {
                            f++;
                        } else {
                            g++;
                        }

                    }

                    for (int i = 0; i < nlen; i++) {
                        arr2.add(in.nextInt());
                        if (arr2.get(i) == 0) {
                            f++;
                        } else {
                            g++;
                        }

                    }

                    if (f==g)
                    {
                        System.out.println(1);
                    }
                    else if ((f == 0) || (g == 0))
                    {
                        System.out.println(0);
                    }
                    else {
                        System.out.println(Math.abs(f - g));
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

