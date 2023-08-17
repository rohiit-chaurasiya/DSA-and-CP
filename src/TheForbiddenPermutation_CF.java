import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-01/02/2023
public class TheForbiddenPermutation_CF
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
//    public static rec()

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
                    int lend=in.nextInt();
                    if(lenn>=2 && lenm>=2 && lend>=1) {
                        ArrayList<Integer>arr1=new ArrayList<>();
                        for(int i=0;i<lenn;i++)
                        {
                            arr1.add(in.nextInt());
                        }

                        ArrayList<Integer>arr2=new ArrayList<>();
                        for(int i=0;i<lenm;i++)
                        {
                            arr2.add(in.nextInt());
                        }
                        int temp=0;
                        int tempp=-1;
                        for(int i=0;i<lenm;i++)
                        {
                            int curr=-1;
                            for(int j=0;j<lenn;j++)
                            {
                                if(arr1.get(j)==arr2.get(i))
                                {
                                    curr=j;
                                    break;
                                }
                            }
                            if(tempp!=-1)
                            {
                                if(curr<=tempp)
                                {
                                    temp+=(tempp-curr+lend)/lend;
                                }
                                tempp=curr;
                            }
                            else{
                                tempp=curr;
                            }
                        }
                        System.out.println(temp);





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


