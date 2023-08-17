import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-01/02/2023
public class FlipFlopSum_CF
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
            if(test>=1 && test<=500)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    if(lena>=2 && lena<=100000) {
                        int temp=0;
                        int tempp=0;
                        ArrayList<Integer>arr1=new ArrayList<>();
                        for(int i=0;i<lena;i++)
                        {
                            arr1.add(in.nextInt());
                            temp+= arr1.get(i);

                        }
//                        int i=0;
                        for(int i=1;i<lena;i++)
                        {
                            if(arr1.get(i)==-1 && arr1.get(i-1)==-1)
                            {
                                tempp=1;
                                break;

                            }
                        }


                        if(tempp!=0)
                        {
                            System.out.println(temp+4);
                        }
                        else{
                            if(temp==lena)
                            {
                                System.out.println(temp-4);
                            }
                            else{
                                System.out.println(temp);
                            }
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


