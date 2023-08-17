import java.util.*;
import java.lang.*;
import java.io.*;



public class Minimum_distance_between__1s_CC
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
                    int lenx=in.nextInt();

                    if(lenx>=2) {
                        String lena=in.next();
                        char[] ch1 = lena.toCharArray();
                        boolean temp=false;
                        Stack<Character>st=new Stack<>();
                        for(int i=0;i<lenx;i++)
                        {
                            if(!st.empty())
                            {
                                if(lena.charAt(i)=='1' && st.peek()=='1')
                                {
                                    temp=true;
                                    break;
                                } else if (lena.charAt(i)=='0' && st.peek()=='0') {
                                    st.pop();

                                }
                                else{
                                    st.push(lena.charAt(i));
                                }
                            }
                            else {
                                st.push(lena.charAt(i));

                            }

                        }

                        if(temp==true)
                        {
                            System.out.println(1);
                        }
                        else {
                            System.out.println(2);
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



