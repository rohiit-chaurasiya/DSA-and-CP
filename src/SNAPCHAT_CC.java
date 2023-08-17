import java.util.*;
import java.lang.*;
import java.io.*;


public class SNAPCHAT_CC
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
                    int lena=in.nextInt();

                    if(lena>=1 && lena<=1000) {
                        ArrayList<Integer>arrA=new ArrayList<>();
                        for(int i=0;i<lena;i++)
                        {
                            arrA.add(in.nextInt());
                        }
                        ArrayList<Integer>arrB=new ArrayList<>();
                        for(int i=0;i<lena;i++)
                        {
                            arrB.add(in.nextInt());
                        }

                        int cnt=0;
                        int result=0;
                        boolean flag=true;
                        for(int i=0;i<lena;i++)
                        {
                            if(arrA.get(i)!=0 && arrB.get(i)!=0)
                            {
                                cnt+=1;
                            }
                            else{

                                result=Math.max(result,cnt);
                                cnt=0;
                            }
                        }
                        result=Math.max(result,cnt);
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


