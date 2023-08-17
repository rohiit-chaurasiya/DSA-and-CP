// Java program to find the
// length of the longest
// decreasing subsequence
import java.io.*;

class shii
{
    static int lds(int arr[], int n)
    {
        int lds[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lds[i] = 1;

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] < arr[j] &&
                        lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;

        for (i = 0; i < n; i++)
            if (max < lds[i])
                max = lds[i];

        return max;
    }
    public static void main (String[] args)
    {
        int arr[] = { 1,3,2};
        int n = arr.length;
        System.out.print("Length of LDS is " +
                lds(arr, n));
    }
}

// This code is contributed by anuj_67.
