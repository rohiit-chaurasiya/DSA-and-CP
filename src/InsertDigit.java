import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-04/04/2023
public class InsertDigit
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
            if(test>=1)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    int lend=in.nextInt();
                    if(lenn>=1 && lend>=0)
                    {
                        String str=in.next();
                        int len=str.length();
                        String result=String.valueOf(lend);
                        int  flag=0;
                        if(lend==0)
                        {

                            str+=result.charAt(0);
                            System.out.println(str);
                            flag=1;
                        }
                        else {
                            for (int i = 0; i < len; i++) {
                                if (str.charAt(i) < result.charAt(0)) {
                                    StringBuffer newString = new StringBuffer(str);
                                    newString.insert(i , result);
                                    System.out.println(newString.toString());
                                    flag=1;
                                    break;
                                }
                            }

                        }
                        if(flag==0){
                            str+=result.charAt(0);
                            System.out.println(str);
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



