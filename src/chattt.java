import java.util.Scanner;

public class chattt {

    public static void makeNonDecreasing(int n, int[] arr) {
        StringBuilder operations = new StringBuilder();
        int operationsCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.max(0, arr[i] - arr[i + 1]);
            arr[i] -= diff;
            arr[i + 1] += diff;

            if (diff > 0) {
                operationsCount++;
                operations.append(i + 1).append(" ").append(i + 2).append("\n");
            }
        }

        System.out.println(operationsCount);
        System.out.print(operations);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            // Read the length of the array
            int n = scanner.nextInt();

            // Read the array elements
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            // Make the array non-decreasing and print the operations
            makeNonDecreasing(n, arr);
        }

        scanner.close();
    }
}
