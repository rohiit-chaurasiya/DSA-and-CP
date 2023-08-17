
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


public class ICPCBooleans_CF
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

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int tt=in.nextInt();
            for(int t=0;t<tt;t++)
            {
                int n=in.nextInt();
                String str=in.nextLine();
//                int frq[]=new int[26];
                int res=0;
//                for(int i=0;i<str.length();i++)
//                {
//                    frq[str.charAt(i)-'A']++;
//                }
                Map<Character, Integer> d = new HashMap<Character, Integer>();

                for(int i = 0; i < str.length(); i++)
                {
                    if(d.containsKey(str.charAt(i)))
                    {
                        d.put(str.charAt(i), d.get(str.charAt(i)) + 1);
                    }
                    else
                    {
                        d.put(str.charAt(i), 1);
                    }
                }


                int cnt=0;
                if(n==1)
                {
                    res=2;
                }

                else{

                    for(int i=0;i<str.length();i++)
                    {

//                        if (frq[str.charAt(i) - 'A'] != 0) {
//                            int ans=frq[str.charAt(i)-'A'];
////                            System.out.println(ans);
//                            if (ans == 1) {
//                                res +=ans*2;
//                            } else {
//                                cnt++;
//                                res +=+1;
//                            }
//                        }

                        if(d.get(str.charAt(i)) != 0)
                        {
                            int ans=(d.get(str.charAt(i)));
                            d.put(str.charAt(i), 0);
                            if(ans>1)
                            {
                                res+=ans+1;
                            }
                            else {
                                res+=ans*2;
                            }
                        }
                    }


                }
                System.out.println(res);


            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

