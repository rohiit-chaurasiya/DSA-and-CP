import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class CardRemoval_CC
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
                if(nlen>=1 && nlen<=100) {
                    ArrayList<Integer> arr1 = new ArrayList<>();
                    for (int i = 0; i < nlen; i++) {
                        arr1.add(in.nextInt());
                    }

                    HashMap<Integer, Integer> map = new HashMap<>();
                    for (int i = 0; i < nlen; i++) {
                        if (map.containsKey(arr1.get(i))) {

                            map.put(arr1.get(i), map.get(arr1.get(i)) + 1);
                        } else {
                            map.put(arr1.get(i), 1);
                        }
                    }
                    int max = Integer.MIN_VALUE;
                    for (Map.Entry<Integer, Integer> el : map.entrySet()) {
                        if (el.getValue() >= max) {
                            max = el.getValue();
                        }
                    }

                    if (map.size() == nlen) {
                        System.out.println(nlen - 1);
                    } else {
                        System.out.println(nlen - max);

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

