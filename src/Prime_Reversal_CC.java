import java.util.*;
import java.lang.*;
import java.io.*;



public class Prime_Reversal_CC
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
            if(test>=1 && test<=100)
            {
                while(test>0) {
                    int lenx=in.nextInt();

                    if(lenx>=1) {
                        String lena=in.next();
                        String lenb=in.next();

                        char[] ch1 = lena.toCharArray();
                        char[] ch2=lenb.toCharArray();

                        Arrays.sort(ch1);
                        Arrays.sort(ch2);

                        String str1 = String.copyValueOf(ch1);
                        String str2=String.copyValueOf(ch2);


//                        System.out.println(str1+"  "+str2);

                        if(str1.equals(str2))
                        {
                            System.out.println("YES");
                        }
                        else {
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



