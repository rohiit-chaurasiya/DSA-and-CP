public class MaximumSumSubArray {
    public static void main(String[] arg)
    {
        int arr[]={1,20,2,3,4,5,30,6,7,8,9,10};
        int k=4;
        int len=arr.length;
        int i=0,j=0;
        int sum=0;
        int max=arr[0];


        int min=Integer.MAX_VALUE/2;
        while(j<len)
        {
            sum=sum+arr[j];
            if((j-i+1)<k)
            {
                j++;
            }
            else if((j-i+1)==k)
            {
                max=Math.max(max,sum);
                min=Math.min(min,sum);
                sum=sum-arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
