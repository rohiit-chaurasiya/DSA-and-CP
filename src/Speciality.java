import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Speciality
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
                int xlen=in.nextInt();
                int ylen=in.nextInt();
                int zlen=in.nextInt();
                if(xlen>ylen && xlen>zlen)
                {
                    System.out.println("Setter");
                }
                else if(ylen>xlen && ylen>zlen)
                {
                    System.out.println("Tester");
                }
                else if(zlen>xlen && zlen>ylen)
                {
                    System.out.println("Editorialist");
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

