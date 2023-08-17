import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;


public class RemoveBracket_CF
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
            if(test>=1 && test<=10000)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    int lens=in.nextInt();
                    if(lenn>=3 && lens>=0)
                    {
                        ArrayList<Integer>arr1=new ArrayList<>();
                        for(int i=0;i<lenn;i++)
                        {
                            arr1.add(in.nextInt());
                        }
                        long result=0;
                        for(int i=1;i<lenn-1;i++)
                        {
                            int temp= arr1.get(i);
                            int tempp=lens*2;
                            result+= (long) Math.min(temp, tempp) *(long)arr1.get(i-1)+(long)Math.abs(temp-tempp)*(long)arr1.get(lenn-1);
                        }
                        System.out.println(result);
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


