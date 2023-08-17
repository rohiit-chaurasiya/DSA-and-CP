import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-25/05/2023
public class ComparisonString
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
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    if(lenn>=1 && lenn<=101)
                    {
                        String str=in.next();
                        int count=1;
                        int max=1;
                        for(int i=1;i<lenn;i++)
                        {
                            if(str.charAt(i)==str.charAt(i-1))
                            {
                                count+=1;
                            }
                            else{
                                max=Math.max(max,count);
                                count=1;
                            }
                        }
                        max=Math.max(max,count);
                        System.out.println(max+1);

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



