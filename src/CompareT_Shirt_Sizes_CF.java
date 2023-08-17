import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class CompareT_Shirt_Sizes_CF
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
                String sz1=in.next();
                String sz2=in.next();

//                if((sz1.length()<=50 && sz2.length()<=50) && (!"XM".equals(sz1)) && (!"LL".equals(sz1)) && (!"SX".equals(sz1)) && (!"XM".equals(sz2)) && (!"LL".equals(sz2)) && (!"SX".equals(sz2)) ) {

                    int x1 = 0;
                    int x2 = 0;
                    for (int i = 0; i < sz1.length(); i++) {
                        if (sz1.charAt(i) == 'X') {
                            x1++;
                        }
                    }
                    for (int i = 0; i < sz2.length(); i++) {
                        if (sz2.charAt(i) == 'X') {
                            x2++;
                        }
                    }
                    int l1 = sz1.length();
                    int l2 = sz2.length();


                    if (sz1.equals(sz2)) {
                        System.out.println("=");
                    } else if (sz1.charAt(l1 - 1) == 'S' && sz2.charAt(l2 - 1) == 'S' && x1 < x2) {
                        System.out.println(">");
                    } else if (sz1.charAt(l1 - 1) == 'L' && sz2.charAt(l2 - 1) == 'L' && x1 > x2) {
                        System.out.println(">");
                    } else if (sz1.charAt(l1 - 1) == 'L' && sz2.charAt(l2 - 1) == 'M') {
                        System.out.println(">");
                    } else if ((sz1.charAt(l1 - 1) == 'L' && sz2.charAt(l2 - 1) == 'S') || (sz1.charAt(l1 - 1) == 'M' && sz2.charAt(l2 - 1) == 'S')) {
                        System.out.println(">");
                    } else {
                        System.out.println("<");
                    }
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

