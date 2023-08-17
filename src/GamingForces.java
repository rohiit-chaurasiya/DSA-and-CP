
import java.util.*;
import java.lang.*;
import java.io.*;


public class GamingForces
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
            if(test>=1 && test<=10000)
            {
                while(test>0) {
                    int lenw=in.nextInt();
                    if(lenw>=1 && lenw<=100) {

                        ArrayList<Integer> arr = new ArrayList<>();
                        int OneT=0;

                        for (int i = 0; i < lenw; i++) {
                            arr.add(in.nextInt());

                            if(arr.get(i)==1)
                            {
                                OneT+=1;
                            }
                        }
                        int skill=0;
                        if(OneT%2==0)
                        {
                            skill=OneT/2;
                        }
                        else{
                            skill=OneT/2+1;
                        }
                        int dKill=lenw-OneT;
                        int result=skill+dKill;
                        System.out.println(result);

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


