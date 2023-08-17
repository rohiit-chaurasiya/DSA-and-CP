import jdk.dynalink.beans.StaticClass;

public class Recursion_Bubble_sort {
    static void bubbleSort(int arr[],int n)
    {
        if(n==0 || n==1)
            return ;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String [] arg)
    {
        int arr[]={1,5,9,2,6,7,3,4};
        bubbleSort(arr,arr.length);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
