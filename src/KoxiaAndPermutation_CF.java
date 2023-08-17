import java.util.*;
import java.lang.*;
import java.io.*;


public class KoxiaAndPermutation_CF
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
            if(test>=1 && test<=2000)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    int lenb=in.nextInt();

                    if(lena>=1 && lenb>=1) {
//                        ArrayList<Integer>Items=new ArrayList<>();
                        int ArrA[]=new int[lena];

                        for(int i=1;i<=lena;i++)
                        {
                            ArrA[i-1]=i;
                        }

                        int i=0;
                        int j=lena-1;
                        while(i<j)
                        {
                            System.out.print(ArrA[j--]+" "+ArrA[i++]+" ");
//                            j--;
//                            i++;
                        }
                        if(lena%2>0) {

                            System.out.print((lena+1)/2+" ");
                        }
                        System.out.println();





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


