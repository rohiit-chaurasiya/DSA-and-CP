import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-27/02/2023
public class EqualizeDivide
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
    public static boolean position(ArrayList<Long>arr)
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
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=2047)
            {
                while(test>0) {
                    int lenn=in.nextInt();

                    if(lenn>=1 && lenn<=11)
                    {
                        String str=in.next();
                        int fir=0;
                        int las=0;
                        int temp=1;
                        for(int i=0;i<str.length();i++)
                        {
                            if(str.charAt(i)=='F')
                            {
                                while(temp%3!=0)
                                {
                                    temp+=1;
                                }
                                if(temp>10000)
                                {
                                    break;
                                }
                                fir+=1;
                            }
                            else{
                                while(temp%5!=0 && temp%3!=0)
                                {
                                    temp+=1;
                                }
                                if(temp>10000)
                                {
                                    break;
                                }
                                las+=1;
                            }
                            temp+=1;
                        }
                        if(fir>0 && las>0 && temp<=10000)
                        {
                            System.out.println("YES");
                        }
                        else{
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



