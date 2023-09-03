package DSA.StackQus;
import java.util.*;

public class NearestGreatestToRight {

    public static int[] nextLargerElement(int[] arr, int n)
    {

        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                res[i]=-1;
            }
            else if(!st.isEmpty() && st.peek()>arr[i])
            {
                res[i]=st.peek();
            }
            else if(!st.isEmpty() && st.peek()<=arr[i])
            {
                while(!st.isEmpty() && st.peek()<=arr[i])
                {
                    st.pop();
                }

                if(st.isEmpty())
                {
                    res[i]=-1;
                }
                else{
                    res[i]=st.peek();
                }

            }

            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[]={1,3,2,4};
        int n=4;
        int res[]=nextLargerElement(arr,n);
        System.out.println(Arrays.toString(res));



    }
}
