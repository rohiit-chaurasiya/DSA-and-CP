import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;


public class Divide_and_Conquer_CF
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
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int len=in.nextInt();
                    if(len>=1 && len<=50) {

                        ArrayList<Integer> arr = new ArrayList<>();
                        ArrayList<Integer> arreven = new ArrayList<>();

                        for (int i = 0; i < len; i++) {
                            int a = in.nextInt();
                            if (a % 2 != 0) {
                                arr.add(a);
                            } else {
                                arreven.add(a);
                            }
                        }

                        int Miniod = Integer.MAX_VALUE;
                        if (arr.size() % 2 != 0) {
                            ArrayList<Integer> miniE = new ArrayList<>();
                            for (int i = 0; i < arr.size(); i++) {
                                int cnt = 0;
                                double data = arr.get(i);
                                while (data % 2 != 0) {
                                    data = Math.floor(data / 2);
                                    cnt++;
                                }
                                miniE.add(cnt);
                            }
                            Miniod = Collections.min(miniE);

                            int evenMin = Integer.MAX_VALUE;
                            if (arreven.size() > 0) {
                                ArrayList<Integer> evenEqual = new ArrayList<>();
                                for (int i = 0; i < arreven.size(); i++) {
                                    int cnt = 0;
                                    double data = arreven.get(i);
                                    while (data % 2 == 0) {
                                        data = Math.floor(data / 2);
                                        cnt++;
                                    }
                                    evenEqual.add(cnt);
                                }
                                evenMin = Collections.min(evenEqual);
                            }
                            System.out.println(Math.min(Miniod, evenMin));
                        } else {
                            System.out.println(0);
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


