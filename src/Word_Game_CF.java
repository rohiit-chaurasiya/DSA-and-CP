import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.math.*;


class Word_Game_CF
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

    static boolean check_one(int a)
    {
        if(a==1)
        {
            return true;
        }
        return false;
    }

    static boolean check_two(int a)
    {
        if(a==2)
        {
            return true;
        }
        return false;
    }

    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
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

                int len=in.nextInt();
                String str[][]=new String[3][len];
                ArrayList<Integer>result=new ArrayList<>();
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<len;j++) {
                        str[i][j]=in.next();
                    }
                }

                Map<String,Integer>map=new HashMap<>();
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<len;j++) {
                        map.put(str[i][j],map.getOrDefault(str[i][j],0)+1);
                    }
                }
                int temp=0;
                for(int i=0;i<3;i++)
                {
                    temp=0;
                    for(int j=0;j<len;j++) {
                        int x=map.get(str[i][j]);
                        if(check_one(x))
                        {
                            temp+=3;
                        }
                        else if(check_two(x))
                        {
                            temp++;
                        }
                    }
                    result.add(temp);

                }

                for(int i=0;i<result.size();i++)
                {
                    System.out.print(result.get(i)+" ");
                }
                System.out.println();

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

