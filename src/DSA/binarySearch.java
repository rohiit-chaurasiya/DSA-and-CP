package DSA;

public class binarySearch {




    public static int search(int[] arr, int target)
    {
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<e)
        {
            int mid=e+s/2;
            if(target==arr[mid])
            {
                ans=mid;
                return mid;
            }
            else if (target<arr[mid]) {
                e=mid-1;

            }
            else{
                s=mid+1;

            }
        }
        return ans;
    }


    public static void main(String[] arg)
    {
        int[] arr={1,4,6,8,9,12,23,45,67};
        int target=23;
        System.out.println(search(arr,target));

    }

}
