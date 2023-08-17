import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-27/02/2023
public class RecentActions
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
                    int lenn=in.nextInt();
                    int lenm=in.nextInt();
                    if(lenn>=1 && lenn<=50001)
                    {
                        ArrayList<Integer>arr=new ArrayList<>();
                        for(int i=0;i<lenm;i++)
                        {
                            arr.add(in.nextInt());
                        }
                        Map<Integer, Integer> mp = new HashMap<>();
                        for(int i=1;i<=lenn;i++)
                        {
                            mp.put(i,-1);
                        }
                        int temp=1;
                        int tempp=lenn;
                        for(int i=0;i<lenm;i++)
                        {
                            if(tempp==0)
                            {
                                break;
                            }
                            if(!mp.containsKey(arr.get(i)))
                            {
                                mp.put(arr.get(i),1 );
                                mp.put(tempp,temp);
                                tempp-=1;
                            }
                            temp+=1;
                        }
                        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                            if(entry.getKey()<=lenn)
                            {
                                System.out.print(entry.getValue()+" ");

                            }

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



