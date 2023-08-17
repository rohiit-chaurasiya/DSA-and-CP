import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-02/04/2023
public class NeedZero
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
    public static boolean position(ArrayList<Long> arr)
    {
        int len=arr.size();
        for(int i=0;i<len-1;i++)
        {
            if(arr.get(i)!=arr.get(i+1))
            {
                return  false;
            }
        }
        return  true;
    }

    public static void main(String r[])
    {
//        try
//        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int lenn=in.nextInt();

                    if(lenn>=1 && lenn<=1001)
                    {
                        ArrayList<Integer>arr=new ArrayList<>(lenn);
                        for(int i=0;i<lenn;i++)
                        {
                            arr.add(in.nextInt());
                        }
                        boolean flag=false;
                        for(int i=0;i<257;i++)
                        {
                            ArrayList<Integer>ans=new ArrayList<>(lenn);
                            for(int j=0;j<lenn;j++)
                            {
                                ans.add(j,arr.get(j)^i);
                            }
                            int result=0;
                            for(int z=0;z<lenn;z++)
                            {
                                result^=ans.get(z);
                            }
                            if(result==0)
                            {
                                flag=true;
                                System.out.println(i);
                                break;

                            }

                        }
                        if(flag==false)
                        {
                            System.out.println("-1");
                        }

                    }
                    test--;
                }
            }
//            out.close();
//        }
//        catch(Exception ex)
//        {
//            System.err.println("Error");
//        }

    }
}




