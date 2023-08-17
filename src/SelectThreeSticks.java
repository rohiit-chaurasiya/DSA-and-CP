import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class SelectThreeSticks
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
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=0;i<len;i++)
                {
                    arr.add(in.nextInt());
                }
                int min=Integer.MAX_VALUE;
                Collections.sort(arr);

                for(int i=0;i<len-2;i++)
                {
                    int temp=Math.abs(arr.get(i)-arr.get(i+1));
                    temp+=Math.abs(arr.get(i+1)-arr.get(i+2));
                    min=Math.min(min,temp);
                }
                System.out.println(min);
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

