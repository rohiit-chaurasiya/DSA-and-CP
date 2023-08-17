public class distinctElements {
    public static void main(String arg[])
    {
        int arr[]={2,5,3,1,2,3,5};
        int len=arr.length;
        int cnt=0;
        boolean isDistinct=true;
        for(int i=0;i<len;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j])
                {
                    isDistinct=false;
                    break;
                }

            }
            if(isDistinct)
            {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
//    public static int CountDistinct(int a[], int n)
//    {
//        int cnt=0;
//        boolean isDistinct=true;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i-1;j>=0;j--)
//            {
//                if(a[i]==a[j])
//                {
//                    isDistinct=false;
//                    break;
//                }
//
//            }
//            if(isDistinct)
//            {
//                cnt++;
//            }
//        }
//        return cnt;
//    }
}
