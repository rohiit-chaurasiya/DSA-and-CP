

import java.util.Scanner;

public class accen2 {
    public static int calcost(int n, int m, int a, int b) {
        int indc = n * a;
        int stc = (n / m) * b;
        int rd = n % m;
        if (rd > 0) {
            stc += Math.min(rd * a, b);
        }
        int tc = Math.min(indc, stc);
        return tc;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int tc = calcost(n, m, a, b);
        System.out.println(tc);
    }
}
