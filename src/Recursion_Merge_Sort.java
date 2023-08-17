public class Recursion_Merge_Sort {
    static void merge(int arr[],int s,int e)
    {
        int mid=s+(e-s)/2;
        int l1=mid-s+1;
        int l2=e-mid;

        int arr1[]=new int[l1];
        int arr2[]=new int[l2];

        int k=s;
        for(int i=0;i<l1;i++)
        {
            arr1[i]=arr[k++];
        }

        k=mid+1;
        for(int i=0;i<l2;i++)
        {
            arr2[i]=arr[k++];
        }

        int i=0;
        int j=0;
        int minIndex=s;
        while (i<l1 && j<l2)
        {
            if(arr1[i]<arr2[j])
                arr[minIndex++]=arr1[i++];
            else
                arr[minIndex++]=arr2[j++];
        }

        while(i<l1)
            arr[minIndex++]=arr1[i++];
        while(j<l2)
            arr[minIndex++]=arr2[j++];
    }

    static void mergeSort(int arr[] ,int s,int e)
    {
        if(s>=e)
            return;

        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }

    public static void main(String [] arg)
    {
        int arr[]={1,3,5,6,9,2,4,5,78,9};
        int s=0;
        int len=arr.length;

        mergeSort(arr,s,len-1);

        for(int i=0;i<len-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
