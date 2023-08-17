
import java.util.Scanner;
public class fun
{
    public static int[] arrange(int arr[], int n){
        int value=1;
        for(int i =0;i<=(n-1)/2;i++){
            arr[i]= value;
            value+=2;
        }
        int value1=n;
        for(int i = ((n-1)/2)+1;i<n;i++){
            if(n%2==0){
                arr[i] = value1;
                value1-=2;
            }
            else {
                arr[i] = value1-1;
                value1-=2;
            }
        }
    return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            int k[] = arrange(arr,n);

        }
    }
}