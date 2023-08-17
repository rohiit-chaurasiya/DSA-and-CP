public class startreverse {
    public static void main(String[] arg)
    {
        String str="NIRDESH";

        for(int i=1;i<str.length();i++)
        {

            for (int j=0;j<=str.length()-i;j+=i)
            {
                System.out.print(str.substring(j,j+i)+" ");
            }
            System.out.println();
        }
    }
}
