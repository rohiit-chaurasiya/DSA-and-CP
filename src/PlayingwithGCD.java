import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class PlayingwithGCD
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

    static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
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
                if(nlen>=1) {
                    ArrayList<Integer> arr1 = new ArrayList<>();
                    for (int i = 0; i < nlen; i++) {
                        arr1.add(in.nextInt());
                    }
                    HashMap<Integer, Integer> mapp = new HashMap<>();
                    boolean flag = false;
                    for (int i = 0; i < nlen - 2; i++) {
                        if (gcd(arr1.get(i), arr1.get(i + 2)) > gcd(arr1.get(i), arr1.get(i + 1))) {
                            System.out.println("NO");
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        System.out.println("YES");
                    }
//                    long add=0;
//                    for(int i=0;i<nlen;i++)
//                    {
//                        add+=arr1.get(i);
//                    }
//                    long re=add%nlen;
//                    if(re==0)
//                    {
//                        System.out.println("YES");
//                    }
//                    else {
//                        System.out.println("NO");
//                    }
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

