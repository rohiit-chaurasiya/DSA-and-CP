import java.util.*;
import java.lang.*;
import java.io.*;


public class ConsecutiveXor_cc
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
            if(test>=1 && test<=100000)
            {
                while(test>0) {
                    int lena=in.nextInt();


                    if(lena>=1 && lena<=100000) {
                        ArrayList<Integer> arr=new ArrayList<>();
                        int tempp=0;
                        for(int i=0;i<lena;i++)
                        {
                            arr.add(in.nextInt());
                            tempp^=arr.get(i);
                        }
                        if(lena==1)
                        {
                            System.out.println("YES");
                        }
                        else{
                            int temp=arr.get(0)^tempp;
                            for(int i=1;i<lena-1;i++)
                            {
                                arr.set(i,arr.get(i)^temp);
                                temp=arr.get(i)^tempp;
                            }
                            if(arr.get(lena-1)!=arr.get(lena-2))
                            {
                                System.out.println("NO");
                            }
                            else{
                                System.out.println("YES");
                            }
                        }





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


