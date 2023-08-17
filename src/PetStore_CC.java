import java.util.*;
import java.lang.*;
import java.io.*;


public class PetStore_CC
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

                    if(lena>=1) {
                        ArrayList<Integer> arrA=new ArrayList<>();
                        HashMap<Integer,Integer>arrMap=new HashMap<>();


                        for(int i=0;i<lena;i++)
                        {
                            arrA.add(in.nextInt());
                        }
                        for(int i=0;i<lena;i++)
                        {
                            if (arrMap.containsKey(arrA.get(i)))
                            {
                                arrMap.put(arrA.get(i), arrMap.get(arrA.get(i)) + 1);
                            }
                            else
                            {
                                arrMap.put(arrA.get(i), 1);
                            }
                        }
                        boolean curr=true;
                        for (Map.Entry<Integer, Integer> entry : arrMap.entrySet())
                        {
                            if(entry.getValue()%2!=0)
                            {
                                System.out.println("No");
                                curr=false;
                                break;
                            }
                        }
                        if(curr)
                        {
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


