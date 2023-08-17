import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.print("Output: ");
        if (a % 2 == 0) {

            int i = 1;
            int k=1;
            while (k<a) {
                System.out.print(i);
                i = i + 2;
                k++;
                if(k<a)
                {
                    System.out.print(",");
                }
            }
        } else {

            int i = 1;
            int k=1;
            while (k<=a) {
                System.out.print(i);
                i = i + 2;
                k++;
                if(k<=a)
                {
                    System.out.print(",");
                }
            }
        }
    }
}
