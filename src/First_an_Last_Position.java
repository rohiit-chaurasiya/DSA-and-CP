import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class First_an_Last_Position
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
            while(test>0)
            {
                int len=in.nextInt();
                int k=in.nextInt();
                int arr[]=new int[len];
                for(int i=0;i<len;i++)
                {
                    arr[i]=in.nextInt();
                }

                int result[]={-1,-1};
                int f=0;
                int l=len-1;
                int mid=f+(l-f)/2;
                int a=0;
                while(f<=l)
                {
                    if(arr[mid]==k)
                    {
                        result[0]=mid;
                        result[1]=l;
                        a++;
                    }
                    if(arr[mid]<k)
                    {
                        f=mid+1;
                    }
                    else
                    {
                        l=mid-1;
                    }
                    mid=f+(l-f)/2;
                }
                System.out.println(result[0]+" "+result[result.length-1]);
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

