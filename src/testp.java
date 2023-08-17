

public class testp {
    public static void main(String[] args) {
        int[][] series = {
                {1, 3, 4, 5},
                {7, 2, 3, 4},
                {1, 3, 2, 1}
        };

        int player = getPlayerOfTheYear(series);
        System.out.println("Player of the year: " + player);
    }

    public static int getPlayerOfTheYear(int[][] series) {
        int playerCount = series.length;
        int periodCount = series[0].length;

        int[] tops = new int[periodCount];
        for (int i = 0; i < periodCount; i++) {
            int bestPerformance = Integer.MIN_VALUE;
            for (int player = 0; player < playerCount; player++) {
                bestPerformance = Math.max(bestPerformance, series[player][i]);
            }
            tops[i] = bestPerformance;
        }
        int longestDuration = 0;
        int playerOfTheYear = -1;
        for (int player = 0; player < playerCount; player++) {
            int duration = 0;
            for (int i = 0; i < periodCount; i++) {
                if (series[player][i] == tops[i]) {
                    duration++;
                    if (duration > longestDuration) {
                        playerOfTheYear = player;
                        longestDuration = duration;
                    }
                } else {
                    duration = 0;
                }
            }
        }
        return playerOfTheYear+1;
    }
}
