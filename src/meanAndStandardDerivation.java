public class meanAndStandardDerivation {
    public static void main(String[] arg)
    {
        int arr[]={1,2,3,4,5};
        int sum=0,sumsq=0;
        double mean,stdDev;
//        for(int i=0;i<arr.length;i++)
//        {
//            sum+=arr[i];
//            sumsq+=arr[i]*arr[i];
//        }
        for(int i:arr)
        {
            sum+=i;
            sumsq+=i*i;
        }
        mean=(double) sum/arr.length;
        stdDev=Math.sqrt((double)sumsq/arr.length-mean*mean );
        System.out.printf("Mean and Standard Derivation is:%.2f%n and %.2f%n",mean,stdDev);


    }
}
