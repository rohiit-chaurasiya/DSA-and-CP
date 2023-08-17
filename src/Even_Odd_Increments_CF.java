import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.*;


class Even_Odd_Increments_CF
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
                int qlen=in.nextInt();
                if(nlen>=1 && qlen>=1)
                {
                    ArrayList<Long> arr1 = new ArrayList<>();
                    for (int i = 0; i <nlen; i++)
                    {
                        arr1.add(in.nextLong());
                    }
                    HashMap<Integer,Integer>qq=new HashMap<>();
                    for(int i=0;i<qlen;i++)
                    {
                        qq.put(in.nextInt(),in.nextInt());
                    }

                    long sum=0;
                    for (Map.Entry<Integer,Integer> q : qq.entrySet())
                    {
                        int k=0;
                        if(q.getKey()==0)
                        {
                            for(int i=0;i<nlen;i++)
                            {
                                if(arr1.get(i)%2==0)
                                {
                                    arr1.set(i, arr1.get(i) + q.getValue());
                                }
                            }
                        }
                        else {
                            for(int i=0;i<nlen;i++)
                            {
                                if(arr1.get(i)%2!=0)
                                {
                                    arr1.set(i, arr1.get(i) + q.getValue());
                                }
                            }

                        }






                    }
                    long result=0;
                    for(int i=0;i<nlen;i++)
                    {
                        result+=arr1.get(i);
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


