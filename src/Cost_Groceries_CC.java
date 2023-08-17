import java.util.*;
import java.lang.*;
import java.io.*;



public class Cost_Groceries_CC
{
    static class FastkReader{
        BufferedReader br;
        StringTokenizer st;
        public FastkReader()
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
    static class FastkWriter{
        private final BufferedWriter bw;
        public FastkWriter()
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
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=100)
            {
                while(test>0) {
                    int lenx=in.nextInt();
                    int leny=in.nextInt();
                    if(lenx>=1 && lenx<=100 && leny>=1 && leny<=100) {
                        ArrayList<Integer> arrI = new ArrayList<>();
                        for(int i=0;i<lenx;i++)
                        {
                            arrI.add(in.nextInt());
                        }
                        ArrayList<Integer>arrM=new ArrayList<>();
                        for(int i=0;i<lenx;i++)
                        {
                            arrM.add(in.nextInt());
                        }
                        int cost=0;
                        for(int i=0;i<lenx;i++)
                        {
                            if(arrI.get(i)>=leny)
                            {
                                cost+=arrM.get(i);
                            }
                        }
                        System.out.println(cost);



                    }


                    test--;
                }
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}



