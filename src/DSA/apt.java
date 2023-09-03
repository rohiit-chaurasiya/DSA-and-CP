package DSA;

public class apt {
    public static void main(String[] arg)
    {

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(j==3)
                {
                    System.out.print("\\"+" ");
                }
                else{
                    System.out.print("/"+" ");
                }

            }
            System.out.println();

        }
    }
}
