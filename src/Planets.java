import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Planets
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
                int len=in.nextInt();
                int lenc=in.nextInt();
                ArrayList<Integer>ele=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    ele.add(in.nextInt());
                }

                Map<Integer,Integer>freq=new HashMap<>();
                int count[]=new int[102];
                for(int curr:ele)
                {
                    count[curr]++;
//                    if(freq.containsKey(ele.get(i)))
//                    {
//                        freq.put(ele.get(i),ele.get(i)+1);
//                    }
//                    else {
//                        freq.put(ele.get(i),1);
//                    }
                }
//                int result=0;
//                for (Map.Entry<Integer, Integer> entry : freq.entrySet())
//                {
////                    System.out.println(entry.getKey() + " " +
//                            result+=Math.min(lenc,entry.getValue());
//                }


                int result=0;
                for(int res:count)
                {
                    result+=Math.min(lenc,res);
                }
                System.out.println(result);

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

