

public class Array_Sorted_or_Not {
    static  boolean binarySearch(int arr[],int n)
    {
        if(n==0 || n==1)
            return true;

        if(arr[n-1]<arr[n-2])
            return false;
        else{
            boolean ans=binarySearch(arr,n-1);
            return ans;
        }
    }


    public static void main(String[] arg)
    {
        int[] arr={};
        int len=0;
        boolean ans=binarySearch(arr,len);
        if(ans)
        {
            System.out.println("Sorted");
        }
        else{
            System.out.println("NO");
        }

    }
}
