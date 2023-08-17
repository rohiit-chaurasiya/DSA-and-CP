import javax.swing.text.html.StyleSheet;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;
import java.util.*;


class Number_Replacement
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

            int test=in.nextInt();
            int t=0;
            while(test>0)
            {
                int alen=in.nextInt();
                if(alen>=1 && alen<=50)
                {
                    ArrayList<Integer> arr1 = new ArrayList<>();
                    for (int i = 0; i <alen; i++)
                    {
                        arr1.add(in.nextInt());
                    }
                    String str=in.next();

                    HashMap<Integer,Integer>nmap=new HashMap<>();
                    for(int i=0;i<alen;i++)
                    {
                        if(nmap.containsKey(arr1.get(i)))
                        {
                            nmap.put(arr1.get(i),nmap.get(arr1.get(i)+1));
                        }
                        else {
                            nmap.put(arr1.get(i),1);
                        }
                    }

                    HashMap<Character,Integer>smap=new HashMap<>();
                    for(int i=0;i<alen;i++)
                    {
                        if(smap.containsKey(str.charAt(i)))
                        {
                            smap.put(str.charAt(i),smap.get(str.charAt(i))+1);
                        }
                        else {
                            smap.put(str.charAt(i),1);
                        }
                    }

                    if(nmap.size()>=smap.size())
                    {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }

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

