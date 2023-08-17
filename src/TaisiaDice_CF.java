import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;


public class TaisiaDice_CF
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
                    int lenn=in.nextInt();
                    int lens=in.nextInt();
                    int lenr=in.nextInt();
                    if(lenn>=2 && lenn<=50 && lens>=1 && lens<=300 ) {
                        ArrayList<Integer>arr1=new ArrayList<>(lenn-1);
                        ArrayList<Integer>arr2=new ArrayList<>();
                        arr1.add(lens-lenr);
//                        arr1.set(lenn-1,lens-lenr);
                        int temp=lens-lenr;
                        for(int i=1;i<lenn;i++)
                        {
                            arr1.add(1);
                            lenr=lenr-1;
                        }
                        int i=0;
                        while(lenr!=0)
                        {
                            if(arr1.get(i)<temp)
                            {
                                int a=arr1.get(i)+1;
                                arr1.set(i,a);
                                lenr--;
                            }
                            else{
                                i++;
                            }

                        }
                        Collections.sort(arr1);
                        for(int j=0;j<arr1.size();j++)
                        {
                            System.out.print(arr1.get(i)+" ");
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


