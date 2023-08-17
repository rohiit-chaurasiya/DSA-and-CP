import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-16/02/2023
public class TwoTowers
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
                    int lenm=in.nextInt();
                    if(lenn>=1 && lenn<=20 && lenm>=1 && lenm<=20)
                    {
                        String str1=in.next();
                        String str2=in.next();
                        boolean flag=true;
//                        StringBuffer sbr = new StringBuffer(str1);
                        StringBuffer sbr1 = new StringBuffer(str2);

                        sbr1.reverse();
                        str2=sbr1.toString();
                        str1=str1+str2;
                        int temp=0;
                        int ct=0;
                        int len=str1.length();
                        for(int i=0;i<len-1;i++)
                        {
                            if(str1.charAt(i)==str1.charAt(i+1))
                            {
                                ct+=1;
                            }
                            if(ct>1)
                            {
                                System.out.println("NO");
                                temp=1;
                                break;
                            }
                        }
                        if(temp==0)
                        {
                            System.out.println("YES");
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



