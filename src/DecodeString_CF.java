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


class DecodeString_CF
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

    static boolean check(int a,int b)
    {
        if(a>b)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
    static boolean check2(int a,int b)
    {
        if(a<b)
        {
            return true;
        }
        else
        {
            return  false;
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
                int lena=in.nextInt();
                char stra[]=new char[lena];
                for(int i=0;i<lena;i++)
                {
                    stra[i]=in.next().charAt(0);
                }
                Set<Integer> hash_Set = new HashSet<Integer>();
                for(int i=0;i<lena;i++)
                {
                    if(stra[i]=='0' && (i==lena-1 || stra[i+1]!='0'))
                    {
                        hash_Set.add(i-2);
                    }
                }

                String result="";
                for(int i=0;i<lena;i++)
                {
                    if(hash_Set.contains(i))
                    {
                        int ext=10*(stra[i]-'0')+(stra[i+1]-'0');
                        result+='a'+ext-1;
                        i+=2;
                    }
                    else {
                        result+='a'+(stra[i]-'0'-1);
                    }
                }

                System.out.println(result);


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

