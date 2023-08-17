import java.util.*;
import java.lang.*;
import java.io.*;


public class FlipThePrefix_CC
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
            if(test>=1 && test<=2000)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    int lenk=in.nextInt();

                    if(lena>=1 && lenk>=1) {
                        String str1=in.next();
                        int result=Integer.MAX_VALUE;

                        int temp[]=new int[lena];
                        int cnt=0;
                        for(int i=1;i<lena;i++)
                        {
                            if(str1.charAt(i-1)!=str1.charAt(i))
                            {
                                cnt+=1;
                                temp[i]=cnt;
                            }
                            else {
                                temp[i]=cnt;
                            }
                        }
                        temp[0]=0;
                        for(int i=lena-1;i>=0;i--)
                        {
                            if((i-(lenk-1))<0)
                            {
                                break;
                            }
                            int curr=temp[i]-temp[i-(lenk-1)];
                            if(str1.charAt(i)=='0')
                            {
                                curr+=1;
                            }
                            result=Math.min(result,curr);

                        }

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


