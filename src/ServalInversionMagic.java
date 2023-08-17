import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-25/02/2023
public class ServalInversionMagic
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
            if(test>=1 && test<=10000)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    if(lenn>=2 && lenn<=100000)
                    {
                        String str=in.next();
                        int i=0;
                        int j=lenn-1;
                        String nstr=str;
                        StringBuffer sbr = new StringBuffer(nstr);
                        sbr.reverse();
                        nstr=sbr.toString();
                        if(str==nstr)
                        {
                            System.out.println("YES");
                        }
                        else{
                            while(i<=j)
                            {
                                if(str.charAt(i)==str.charAt(j))
                                {
                                    i++;
                                    j--;
                                }
                                else{
                                    break;
                                }
                            }
                            while(i<=j)
                            {
                                if(str.charAt(i)!=str.charAt(j))
                                {
                                    char ch=str.charAt(j);
                                    str = str.substring(0, i) + ch
                                            + str.substring(i + 1);
                                    i++;
                                    j--;
                                }
                                else{
                                    break;
                                }
                            }
                            nstr=str;
                            StringBuffer ssbr = new StringBuffer(nstr);
                            ssbr.reverse();
                            nstr=ssbr.toString();
                            if(nstr==str)
                            {
                                System.out.println("YES");
                            }
                            else{
                                System.out.println("NO");
                            }



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



