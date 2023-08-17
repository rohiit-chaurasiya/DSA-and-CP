import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Colourblindness_CF
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
                char arr[][]=new char[2][len];
                String str1=in.next();
                String str2=in.next();
                int cnt=0;
                for(int i=0;i<len;i++)
                {
//                  if(str1.charAt(i)== str2.charAt(i) || (str1.charAt(i)=='B' && str2.charAt(i)=='G') || (str1.charAt(i)=='G' && str2.charAt(i)=='B')) ;
                    if(str1.charAt(i)=='G')
                    {
                        char ch='B';
                        str1 = str1.substring(0, i) + ch
                                + str1.substring(i + 1);
                    }
                }
                for(int i=0;i<len;i++)
                {
                    if(str2.charAt(i)=='G')
                    {
                        char ch='B';
                        str2 = str2.substring(0, i) + ch
                                + str2.substring(i + 1);
                    }
                }
                if(str1.equals(str2))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
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

