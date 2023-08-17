import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;


public class Add_Plus_Minus_Sign_CF
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
                    int strLen=in.nextInt();
                    if(strLen>=2 && strLen<=100) {
                        String str1 = in.next();

                        int curr = 0;
                        String result = "";

                        if (str1.charAt(0) == '1') {
                            curr++;
                        }

                        for (int i = 1; i < strLen; i++) {
                            if (str1.charAt(i) == '0') {
                                result += "+";

                            } else {
                                if (curr == 0) {
                                    result += "+";
                                    curr++;
                                } else {
                                    result += "-";
                                    curr--;
                                }
                            }
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


