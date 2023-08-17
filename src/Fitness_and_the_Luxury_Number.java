//import java.beans.PropertyEditorSupport;
//import java.io.*;
//import java.util.StringTokenizer;
//import java.util.*;
//
//
//class Fitness_and_the_Luxury_Number
//{
//    static class FastReader{
//        BufferedReader br;
//        StringTokenizer st;
//        public FastReader()
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
//    static class FastWriter{
//        private final BufferedWriter bw;
//        public FastWriter()
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
//    static BigInteger check(BigInteger q)
//    {
//        if(q==0)
//        {
//            return 0;
//        }
//        BigInteger alpha=0;
//        BigInteger bita=(long)Math.sqrt(q);
//        BigInteger thitha=bita*bita;
//        alpha=(bita-1)*3;
//        BigInteger gama=q-thitha;
//        alpha+=(gama/bita);
//        return ++alpha;
//
//    }
//
//    public static void main(String r[])
//    {
//        try
//        {
//            FastReader in =new FastReader();
//            FastWriter out=new FastWriter();
//            Scanner sc=new Scanner(System.in);
//
//            int test=in.nextInt();
//            int t=0;
//            while(test>0)
//            {
//                BigInteger llen=sc.nextBigInteger();
//                BigInteger rlen=sc.nextBigInteger();
//
//
//                llen--;
//                System.out.println(check(rlen)-check(llen));
//
//
//                test--;
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
