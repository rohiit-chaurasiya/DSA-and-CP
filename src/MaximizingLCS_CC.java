//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
//
//public class MaximizingLCS_CC
//{
//    static class FastkReader{
//        BufferedReader br;
//        StringTokenizer st;
//        public FastkReader()
//        {
//            br=new BufferedReader(new InputStreamReader(System.in));
//        }
//        String next()
//        {
//            while(st==null || !st.hasMoreTokens())
//            {
//                try {
//                    st=new StringTokenizer(br.readLine());
//                }
//                catch(IOException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//        double nextDouble() {
//            return Double.parseDouble(next());
//        }
//        String nextLine() {
//            String str="";
//            try {
//                str=br.readLine().trim();
//            }
//            catch(Exception e) {
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
//    static class FastkWriter{
//        private final BufferedWriter bw;
//        public FastkWriter()
//        {
//            this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
//        }
//        public void print(Object object)throws IOException{
//            bw.append(""+object);
//        }
//        public void println(Object object)throws IOException{
//            print(object);
//            bw.append("\n");
//        }
//        public void close()throws IOException {
//            bw.close();
//
//        }
//
//    }
//
//    public static void main(String r[])
//    {
//        try
//        {
//            FastkReader in =new FastkReader();
//            FastkWriter out=new FastkWriter();
//
//            int test=in.nextInt();
//            if(test>=1 && test<=1000)
//            {
//                while(test>0) {
//                    int lena=in.nextInt();
//
//                    if(lena>=1 && lena<=5000) {
//                        String str1=in.next();
//                        String temp=str1;
//
//                        StringBuffer sbr = new StringBuffer(str1);
//
//                        sbr.reverse();
//                        str1=sbr.toString();
//                        System.out.println(temp);
//
//                        ArrayList<ArrayList<Integer>>narr=new ArrayList<>();
//                        for(int i=1;i<=lena;i++)
//                        {
//                            for(int j=1;j<=lena;j++)
//                            {
//                                if(temp.charAt(i-1)==temp.charAt(j-1))
//                                {
//                                    narr.add()
//                                }
//                            }
//                        }
//
//
//                    }
//                    test--;
//                }
//            }
//            out.close();
//        }
//        catch(Exception ex)
//        {
//            System.err.println("Error");
//        }
//
//    }
//}
//
//
