import java.util.*;
import java.lang.*;
import java.io.*;


public class GoingCinema_CF
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
                    if(lenw>=2 && lenw<=100000)
                    {
                        ArrayList<Integer>arr=new ArrayList<>();
                        for(int i=0;i<lenw;i++)
                        {
                            arr.add(in.nextInt());
                        }

                        HashMap<Integer,Integer>mparr=new HashMap<>();
                        Collections.sort(arr);
                        int result=0;
                        for(int i=0;i<lenw;i++)
                        {
                            if(mparr.containsKey(arr.get(i)))
                            {
                                mparr.put(arr.get(i),mparr.get(arr.get(i))+1);
                            }
                            else{
                                mparr.put(arr.get(i),1);
                            }

                        }
                        int a=mparr.get(mparr.keySet().toArray()[0]);
//                        String firstKey = mparr.keySet().stream().findFirst().get();
//                        int a=Integer.parseInt(firstKey);
                        System.out.print("aa"+a);
                        if(a==0)
                        {
                            result=2;

                        }
                        else{
                            result=1;
                        }

                        for(int i=0;i<lenw-1;i++)
                        {
                            if(arr.get(i)<i+1 && arr.get(i+1)>=i+2)
                            {
                                result+=1;
                            }
                        }
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


