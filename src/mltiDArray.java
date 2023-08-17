public class mltiDArray {
    public static void main(String[] arg)
    {
        int n=2,m=3;
        int arr[][]=new int[n][m];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i].length);
//                System.out.print(arr[j].length);
            }
            System.out.println();
        }


    }
}
