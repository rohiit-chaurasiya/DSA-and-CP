import java.util.*;
import java.lang.*;
import java.io.*;


public class MakeBeautiful_CF
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
            if(test>=1 && test<=2000)
            {
                while(test>0) {
                    int lena=in.nextInt();

                    if(lena>=2 && lena<=50) {
                        ArrayList<Integer> arrT=new ArrayList<>();
                        for(int i=0;i<lena;i++)
                        {
                            arrT.add(in.nextInt());
                        }
                        Collections.reverse(arrT);
                        int tempp=0;
                        ArrayList<Integer>item=new ArrayList<>();
                        for(int i=0;i<lena/2;i++)
                        {
                            item.add(arrT.get(i));
                            item.add(arrT.get(lena-i-1));
                        }
                        if((lena&1)!=0)
                        {
                            item.add(arrT.get(lena/2));
                        }
                        boolean temppp=false;
                        for(int i=0;i<lena;i++)
                        {
                            if(item.get(i)==tempp)
                            {
                                System.out.println("NO");
                                temppp=true;
                            }
                            tempp+=item.get(i);
                        }
                        if(temppp==false)
                        {
                            int itlen=item.size();
                            System.out.println("YES");
                            for(int j=0;j<itlen;j++)
                            {
                                System.out.print(item.get(j)+" ");
                            }
                            System.out.println();
                        }
//                        HashMap<Integer, Integer> freqMap= new HashMap<Integer, Integer>();
//
//                        for (int i=0;i<lena;i++)
//                        {
//                            if (freqMap.containsKey(arrT.get(i)))
//                            {
//                                freqMap.put(arrT.get(i), freqMap.get(arrT.get(i)) + 1);
//                            }
//                            else
//                            {
//                                freqMap.put(arrT.get(i), 1);
//                            }
//                        }
//                        int mplen=freqMap.size();
//                        if(mplen==1)
//                        {
//                            System.out.println("NO");
//                        }
//                        else if(lena==1)
//                        {
//                            System.out.println("YES");
//                        }
//                        else if(lena==2 && arrT.get(0)==arrT.get(1))
//                        {
//                            System.out.println("NO");
//                        }
//                        else{
//                            Collections.sort(arrT);
//
//                            System.out.println("YES");
//
//                            if(arrT.get(0)==arrT.get(1))
//                            {
//                                Collections.swap(arrT,0,lena-2);
//
//                            }
//                            for(int j=0;j<arrT.size();j++)
//                            {
//                                System.out.print(arrT.get(j)+" ");
//                            }
//                            System.out.println();
//                        }


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


