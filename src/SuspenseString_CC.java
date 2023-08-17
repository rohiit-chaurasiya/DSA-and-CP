import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class SuspenseString_CC
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
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
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter()
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

    static boolean gameCheck(char c)
    {
        if(c=='0')
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();

            int test=in.nextInt();
            int t=0;
            while(test>0)
            {
                int xlen=in.nextInt();
                if(xlen>=1)
                {
                    String game = in.next();

                    String result ="";
                    int i = 0, j = xlen - 1;
                    while (i <= j) {
                        if (gameCheck(game.charAt(i)))
                        {
                            result = game.charAt(i) + result;
                        }
                        else {
                            result = result + game.charAt(i);
                        }
                        if (i < j) {
                            if(gameCheck(game.charAt(j)))
                            {
                                result = result + game.charAt(j);
                            }
                            else {
                                result = game.charAt(j) + result;
                            }
                            j--;
                        }
                        i++;
                    }
                    System.out.println(result);
                }

                test--;
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

