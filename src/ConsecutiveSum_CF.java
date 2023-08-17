import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.*;


class ConsecutiveSum_CF
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
    static boolean check(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        return false;
    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
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
                int temp=in.nextInt();
                ArrayList<Long>arr=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    arr.add(in.nextLong());
                }

//                ArrayList<Integer>result=new ArrayList<>();
                int result[]=new int[temp];
                for(int i=0;i<len;i++)
                {
                    result[(i+1)%temp]= (int) Math.max(result[(i+1)%temp],arr.get(i));
                }

                Long finalResult=0L;
                for(int i=0;i<temp;i++)
                {
                    finalResult+=result[i];
                }

                System.out.println(finalResult);

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

