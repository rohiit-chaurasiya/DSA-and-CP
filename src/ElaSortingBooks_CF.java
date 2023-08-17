import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


class ElaSortingBooks_CF
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
                int nlen=in.nextInt();
                int klen=in.nextInt();
                String str=in.next();
                if(nlen>=1 && klen>=1) {

                    int arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};
                    //                for(int i=0;i<str.length();i++)
                    //                {
                    //
                    //                }
                    HashMap<Character, Integer> cmap = new HashMap<>();
                    int alpha[] = new int[26];
                    String result = "";
                    for (int i = 0; i < str.length(); i++) {
                        if (cmap.containsKey(str.charAt(i))) {
                            cmap.put(str.charAt(i), cmap.get(str.charAt(i)) + 1);
                        } else {
                            cmap.put(str.charAt(i), 1);
                        }
                    }

                    for (int i = 0; i < 26; i++) {
                        alpha[i] = 0;
                    }

                    for (Map.Entry<Character, Integer> E : cmap.entrySet()) {
                        alpha[E.getKey() - 'a'] = E.getValue();
                    }

                    int k = klen;
                    while (k > 0) {
                        boolean check = true;
                        int j = 0;
                        int emax = Math.min(nlen / klen, 26);
                        for (int i = 0; i < emax; i++, j++) {
                            if (alpha[i] == 0) {
                                check = false;
                                break;
                            }
                            alpha[i]--;
                        }

                        if (check) {
                            int a = 97 + nlen / klen;
                            char c = (char) a;
                            result += c;
                        } else {
                            int a = 97 + j;
                            char c = (char) a;
                            result += c;
                        }
                        k--;

                    }
                    System.out.println(result);
                }



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

