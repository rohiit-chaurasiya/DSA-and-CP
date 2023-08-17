
import java.util.Scanner;
public class ncls {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        int subjects = scanner.nextInt();

        int marks[][] = new int[students][subjects];

        for (int row = 0; row < students; row++) {
            for (int col = 0; col < subjects; col++) {
                marks[row][col] = scanner.nextInt();
            }
        }
        scanner.close();


        int avg[] = new int[subjects];
        int min = -1;
        int skipIndex = -1;

        for (int sub = 0; sub < subjects; sub++) {
            for (int stu = 0; stu < students; stu++) {
                avg[sub] += marks[stu][sub];
            }
            avg[sub] /= students;

            if (sub == 0) {
                min = avg[0];
                skipIndex = 0;
            } else if (avg[sub] < min) {
                min = avg[sub];
                skipIndex = sub;
            }
        }

        int result[] = new int[students];
        for (int row = 0; row < students; row++) {
            for (int col = 0; col < subjects; col++) {
                if (skipIndex != col)
                    result[row] += marks[row][col];
            }
        }

        for (int mark : result) {
            System.out.print(mark + " ");
        }
    }
}