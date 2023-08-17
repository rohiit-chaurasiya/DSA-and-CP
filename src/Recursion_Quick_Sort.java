public class Recursion_Quick_Sort {
    static int partition(int arr[],int s,int e)
    {
        int pivot=arr[s];
        int cnt=0;
        for(int i=s+1;i<=e;i++)
        {
            if(pivot>=arr[i])
                cnt++;
        }

        int pivotIndex=s+cnt;
        int temp=arr[s];
        arr[s]=arr[pivotIndex];
        arr[pivotIndex]=temp;

        int i=s,j=e;
        while(i<pivotIndex && j>pivotIndex)
        {
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;

            if(i<pivotIndex && j>pivotIndex)
            {
                int tem=arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quickSort(int arr[], int s,int e)
    {
        if(s>=e)
            return;

        int p=partition(arr,s,e);
        quickSort(arr,0,p-1);
        quickSort(arr,p+1,e);
    }

    public static void main(String[] arg)
    {
        int arr[]={1,5,9,2,3,8,7};
        int len=arr.length;
        quickSort(arr,0,len-1);

        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
