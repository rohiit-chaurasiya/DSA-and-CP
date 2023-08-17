import java.util.Scanner;

public class iastest1 {

    public static int maximumValue(int N, int[] arr) {
        int[] newArr = new int[N];

        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                newArr[i] = newArr[i - 1] + 1;
            } else {
                newArr[i] = newArr[i - 1];
            }
        }

        int max = 0;
        for (int val : newArr) {
            max = Math.max(max, val);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = maximumValue(N, arr);
        System.out.println(result);
    }
}

