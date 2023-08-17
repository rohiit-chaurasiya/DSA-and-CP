import java.util.*;
import java.lang.*;
import java.io.*;


public class HayatoSchool
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
                    if(lenw>=3 && lenw<=300) {

                        ArrayList<Integer> arr = new ArrayList<>();
                        int tcn=0;


                        for (int i = 0; i < lenw; i++) {
                            arr.add(in.nextInt());
                            tcn+=arr.get(i)%2;


                        }
                        if(tcn<3 && ((lenw-tcn)<2 || tcn==0) )
                        {
                            System.out.println("NO");
                        }
                        else{
                            System.out.println("YES");
                            if(tcn>=3)
                            {
                                int trm=3;
                                for(int i=0;i<lenw;i++)
                                {
                                    if(arr.get(i)%2!=0 && trm!=0)
                                    {
                                        System.out.print(i+1+" ");
                                        trm-=1;
                                    }
                                }

                            }
                            else{
                                int ttrm=2,trmm=1;
                                for(int i=0;i<lenw;i++)
                                {
                                    if(arr.get(i)%2!=0 && trmm!=0)
                                    {
                                        System.out.print(i+1+" ");
                                        trmm-=1;
                                    }
                                    else if(arr.get(i)%2==0 && ttrm!=0)
                                    {
                                        System.out.print(i+1+" ");
                                        ttrm-=1;
                                    }
                                }
                            }
                            System.out.println();
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


