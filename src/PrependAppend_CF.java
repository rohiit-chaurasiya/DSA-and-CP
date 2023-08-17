import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-03/02/2023
public class PrependAppend_CF
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
//    public static rec()

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
                    int lenn=in.nextInt();
                    if(lenn>=1 && lenn<=2000)
                    {
                        String str=in.next();
                        int start=0,end=lenn-1;
                        int result=lenn;
                        boolean flag=false;
                        while(start<=end)
                        {
                            if((str.charAt(start)=='1' && str.charAt(end)=='0') || (str.charAt(start)=='0' && str.charAt(end)=='1'))
                            {
                                result-=2;
                                start++;
                                end--;
                            }
                            else{
                                flag=true;
                                System.out.println(result);
                                break;
                            }
                        }
                        if(flag==false)
                        {
                            System.out.println(result);
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



