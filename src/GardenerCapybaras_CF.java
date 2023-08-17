import java.util.*;
import java.lang.*;
import java.io.*;


public class GardenerCapybaras_CF
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
//        try
//        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=500)
            {
                while(test>0) {

                    String str1=in.next();
                    int lens=str1.length();
                    System.out.println(str1);

//                    if(lens>=3 && lens<=100) {

//                        if(str1.charAt(0)==str1.charAt(lens-1))
//                        {
//                            String a="";
//                            String b="";
                            String z="";
//                            a=str1.substring(0,1);
//
//                            b=str1.substring(1,lens-2);
                            z=str1.substring(lens-1,1);

//                            c=str1.substring(lens,1);
                    System.out.println(z);
//                            System.out.println(a+" "+b+" "+c);

//                        }
//                        else if(str1.charAt(0)!=str1.charAt(lens-1)){
//                            for(int i=1;i<lens-1;i++)
//                            {
//                                if(str1.charAt(i)=='a')
//                                {
//                                    String d=str1.substring(0,i);
//                                    String e=str1.substring(i,1);
//                                    String f=str1.substring(i+1,lens-i-1);
//                                    System.out.println(d+" "+e+" "+f);
//                                }
//                                if(str1.charAt(i)=='b')
//                                {
//                                    String g=str1.substring(0,1);
//                                    String h=str1.substring(i,lens-i-1);
//                                    String k=str1.substring(lens-1,1);
//                                    System.out.println(g+" "+h+" "+i);
//                                }
//                            }

//                        }






//                    }
                    test--;
                }
            }
//            out.close();
//        }
//        catch(Exception ex)
//        {
//            System.err.println("Error");
//        }

    }
}


