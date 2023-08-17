import java.util.*;
import java.lang.*;
import java.io.*;


public class LostPermutation_CF
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
            if(test>=1 && test<=100)
            {
                while(test>0) {
                    int mlen = in.nextInt();
                    int slen=in.nextInt();
                    int maxim=Integer.MIN_VALUE;
                    if (mlen>=1 && mlen<=50)
                    {
                        ArrayList<Integer>arr=new ArrayList<>();
                        Set<Integer>arrset=new HashSet<>();

                        for(int i=0;i<mlen;i++)
                        {
                            arr.add(in.nextInt());
                            arrset.add(arr.get(i));
                        }
                        for(int i=0;i<mlen;i++)
                        {
                            if(maxim<arr.get(i))
                            {
                                maxim=arr.get(i);
                            }
                        }
                        int temp=1;
                        int sub=0;
                        while(temp>0) {
                            if (!arrset.contains(temp)) {
                                temp++;
                                continue;
                            }

                            sub += temp;
                            if (sub > slen) {
                                System.out.println("NO");
                                break;
                            }
                            arrset.add(temp);
                            if (sub == slen) {
                                int tem = 0;
                                for (int j = 1; j <= maxim; j++) {
                                    if (!arrset.contains(j)) {
                                        continue;
                                    }
                                    tem = 1;
                                    break;
                                }
                                if (tem > 0) {
                                    System.out.println("YES");

                                } else {
                                    System.out.println("NO");
                                }
                                break;
                            }
                            temp++;
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


