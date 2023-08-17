import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.*;

public class accen {
    public static int numbers(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j * j <= i) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                j++;
            }
        }
        return dp[n];
    }
    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(numbers(n));
    }
}
