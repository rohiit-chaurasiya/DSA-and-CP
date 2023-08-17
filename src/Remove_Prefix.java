import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.math.*;


public class Remove_Prefix
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

    public static boolean areDistinct(ArrayList<Integer>arr,int st)
    {
        ArrayList<Integer>newlist=new ArrayList<>();
        for(int i=st;i<arr.size();i++)
        {
            newlist.add(arr.get(i));
        }
        Set<Integer> s = new HashSet<Integer>(newlist);
        return (s.size() == newlist.size());
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
                int len=in.nextInt();
                ArrayList<Integer>list=new ArrayList<>();
                HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();

                for(int i=0;i<len;i++)
                {
                    int a=in.nextInt();
                    list.add(a);
                    if(map.containsKey(a))
                        map.put(a,map.get(a)+1);
                    else {
                        map.put(a, 1);
                    }
                }
                int cnt=0;
                int s=len;
                Set<Integer>set=new HashSet<>(list);
                int i=0;
                while(map.size()!=s)
                {
                    cnt++;
                    map.put(list.get(i),map.get(list.get(i))-1);
                    if(map.get(list.get(i))==0)
                        map.remove(list.get(i));
                    i++;
                    s--;
                }
                System.out.println(cnt);
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

