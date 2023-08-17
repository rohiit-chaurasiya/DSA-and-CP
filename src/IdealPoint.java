import java.util.*;
import java.lang.*;
import java.io.*;


//Rohit-16/02/2023
public class IdealPoint
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
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    int lenk=in.nextInt();
                    if(lenn>=1 && lenn<=50 && lenk>=1 && lenk<=50)
                    {
                        int temp=0,tempp=0;
                        for(int i=0;i<lenn;i++)
                        {
                            int f=in.nextInt();
                            int l=in.nextInt();
                            if(f==lenk)
                            {
                                temp+=1;
                            }
                            if(l==lenk)
                            {
                                tempp+=1;
                            }
                        }
                        if(temp>0 && tempp>0)
                        {
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
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



