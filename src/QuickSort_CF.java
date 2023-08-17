import java.util.*;
import java.lang.*;
import java.io.*;


public class QuickSort_CF
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
                    int lena=in.nextInt();
                    int lenb=in.nextInt();

                    if(lena>=2 && lena<=100000 && lenb>=1 && lenb<=lena) {
//                        System.out.println(lena-1);
                        ArrayList<Long>arrT=new ArrayList<>();
                        for(int i=0;i<lena;i++)
                        {
                            arrT.add(in.nextLong());
                        }
                        long temp=0;
                        long tempp=1;
                        for(int j=0;j<lena;j++)
                        {
                            if(arrT.get(j)==tempp)
                            {
                                temp+=1;
                                tempp+=1;
                            }
                        }
                        long resulop=lena-temp;
                        if(resulop%lenb==0)
                        {
                            System.out.println(resulop/lenb);
                        }
                        else{
                            System.out.println(resulop/lenb+1);
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


