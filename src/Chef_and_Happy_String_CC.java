import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class Chef_and_Happy_String_CC
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
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
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter()
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

    static boolean check(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u')
        {
            return true;
        }
        return false;

    }

    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();

            int test=in.nextInt();
            int t=0;
            while(test>0)
            {
                String str1=in.next();
                if(str1.length()>=3) {

                    Set<Character> s = new HashSet<>();
                    boolean happy = false;
                    for (int i = 0; i < str1.length() - 2; i++) {
                        if (check(str1.charAt(i)) && check(str1.charAt(i + 1)) && check(str1.charAt(i + 2))) {
                            happy = true;
                        }
                    }
                    if (happy) {
                        System.out.println("Happy");
                    } else {
                        System.out.println("Sad");
                    }


                    int i = 0, j = 0;
                    String curr = "";
                    String prev = "";
                }

//                Set<Character> s1 = new HashSet<>();
//                Set<Character> s2 = new HashSet<>();
//
//
//                while(j<str1.length())
//                {
//                    if(str1.charAt(j)=='a' || str1.charAt(j)=='e' || str1.charAt(j)=='i' || str1.charAt(j)=='o'|| str1.charAt(j)=='u')
//                    {
//                        s1.add(str1.charAt(j));
//                    }
//                    if(str1.charAt(j)=='a' || str1.charAt(j)=='e' || str1.charAt(j)=='i' || str1.charAt(j)=='o'|| str1.charAt(j)=='u')
//                    {
//                        j++;
//                    }
//                    else if(s1.size()>2)
//                    {
//                        if(s1.size()==s.size())
//                        {
//                            flag=true;
//                        }
//                        else {
//                            s1.remove(str1.charAt(j));
//                            i++;
//                        }
//                        j++;
//                    }

                test--;
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

