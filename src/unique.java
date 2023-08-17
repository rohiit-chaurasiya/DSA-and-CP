import java.util.Scanner;
public class unique {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(isDistinct(arr, len));
    }

    public static int isDistinct(int arr[], int len) {
        int element = 0;
        int newarr[] = new int[len];
        newarr[0] = arr[0];
        for (int i = 0; i < len; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < len; j++) {
                if(i==j)
                {
                    continue;
                }
                 else if(arr[i]==arr[j])
                {
                    isDistinct=false;
                }
            }
            if(isDistinct)
            {
                element=arr[i];
            }
        }
        return element;
    }
}
