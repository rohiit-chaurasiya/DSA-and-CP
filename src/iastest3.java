import java.util.*;

public class iastest3 {

    public static void findMaxProfitStock(int n, double[] opening, double[] closing) {
        double maxProfitPercentage = 0;
        StringBuilder maxProfitStocks = new StringBuilder();

        for (int i = 0; i < n; i++) {
            double profitPercentage = ((closing[i] - opening[i]) / opening[i]) * 100;

            if (profitPercentage > maxProfitPercentage) {
                maxProfitPercentage = profitPercentage;
                maxProfitStocks = new StringBuilder(Integer.toString(i + 1));
            } else if (profitPercentage == maxProfitPercentage) {
                maxProfitStocks.append(" ").append(i + 1);
            }
        }

        System.out.println(maxProfitStocks.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] opening = new double[n];
        for (int i = 0; i < n; i++) {
            opening[i] = scanner.nextDouble();
        }

        double[] closing = new double[n];
        for (int i = 0; i < n; i++) {
            closing[i] = scanner.nextDouble();
        }

        findMaxProfitStock(n, opening, closing);
    }
}

