import java.util.Scanner;

public class Sort0_1 {
        public static void main(String[] arg) {
            Scanner scan = new Scanner(System.in);
            int len = scan.nextInt();
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = scan.nextInt();
            }
            int temp=0;
            for(int i=0;i<len;i++)
            {
                for(int j=1;j<len-1;j++)
                {
                    if(arr[j-1]>arr[j])
                    {
                        temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }

                }
            }
            for(int i=0;i<len;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }


