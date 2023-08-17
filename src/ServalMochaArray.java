import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-25/02/2023
public class ServalMochaArray
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
//    public static rec()

    public static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=500)
            {
                while(test>0) {
                    int lenn=in.nextInt();
                    if(lenn>=2 && lenn<=100)
                    {
                        ArrayList<Integer>arr1=new ArrayList<>();
                        for(int i=0;i<lenn;i++)
                        {
                            arr1.add(in.nextInt());
                        }
                        int temp=100000;
                        for(int i=0;i<lenn;i++)
                        {
                            for(int j=i+1;j<lenn;j++)
                            {
                                temp=Math.min(temp,gcd(arr1.get(i),arr1.get(j)));
                            }
                        }
                        if(temp>2)
                        {
                            System.out.println("NO");
                        }
                        else{
                            System.out.println("YES");
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



