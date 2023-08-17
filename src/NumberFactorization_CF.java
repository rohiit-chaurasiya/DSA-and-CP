import java.util.*;
import java.lang.*;
import java.io.*;


public class NumberFactorization_CF
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
                    int lena=in.nextInt();
                    if(lena>=2)
                    {
                        int temp=lena;
                        int tmaxi=1;
                        Map<Integer,Integer>tmap=new HashMap<>();
                        for(int i=2;i*i<=lena;++i)
                        {
                            if(temp%i==0)
                            {
                                int tempp=0;
                                while(temp%i==0)
                                {
                                    tempp+=1;
                                    temp/=i;
                                }
                                tmap.put(i,temp);
                                if(tempp>tmaxi)
                                {
                                    tmaxi=tempp;
                                }
                            }
                        }
                        if(temp!=1)
                        {
                            tmap.put(temp,temp);
                        }
                        int result=0;
                        for(int i=0;i<tmaxi;i++)
                        {
                            int curr=0;
                            for (Map.Entry entry : tmap.entrySet()) {
                                System.out.println(entry.getKey() + " " + entry.getValue());
                                Integer ss=(Integer) entry.getValue();
                                if(ss>0)
                                {
                                    Integer kk=(Integer) entry.getKey();

                                }
                            }
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


