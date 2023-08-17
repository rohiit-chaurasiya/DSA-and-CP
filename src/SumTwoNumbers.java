import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-09/02/2023
public class SumTwoNumbers
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
    public static long solve(long a)
    {
        int add=0;
        while(a>0)
        {
            add+=a%10;
            a/=10;
        }
        return add;
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
                    if(lenn>=1 && lenn<=1000000000)
                    {
                        int j=0;
                        int tflag=0;
                        int digit[]=new int[10];
                        while(lenn>0)
                        {
                            digit[j++]=lenn%10;
                            lenn/=10;
                        }
                        ArrayList<Integer>arr1=new ArrayList<>(10);
                        ArrayList<Integer>arr2=new ArrayList<>(10);
                        for(int z=0;z<j;z++)
                        {
                            if((digit[z]&1)!=0)
                            {
                                arr1.add(digit[z]/2+tflag);
                                arr2.add(digit[z]/2+1-tflag);
                                tflag=1-tflag;
                            }
                            else{
                                arr1.add(digit[z]/2);
                                arr2.add(digit[z]/2);
                            }
                        }
                        int temp=0,tempp=0,lenm=1;
                        for(int k=0;k<j;k++)
                        {
                            tempp+=arr2.get(k)*lenm;
                            temp+=arr1.get(k)*lenm;
                            lenm*=10;
                        }
                        System.out.println(temp+" "+tempp);




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



