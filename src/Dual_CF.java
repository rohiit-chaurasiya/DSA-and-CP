import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dual_CF {

    public static int maxVictoryPoints(int n, int[] cards) {
        PriorityQueue<Integer> unlockedCards = new PriorityQueue<>((a, b) -> b - a);
        for (int card : cards) {
            unlockedCards.add(card);
        }

        int victoryPoints = 0;
        while (!unlockedCards.isEmpty()) {
            int v = unlockedCards.poll();
            if (v == 0) {
                return victoryPoints;
            }

            victoryPoints += v;
            if (v <= unlockedCards.size()) {
                for (int i = 0; i < v; i++) {
                    unlockedCards.poll();
                }
            } else {
                unlockedCards.clear();
            }
        }
        return victoryPoints;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] cards = new int[n];
            for (int j = 0; j < n; j++) {
                cards[j] = scanner.nextInt();
            }
            int maxPoints = maxVictoryPoints(n, cards);
            System.out.println(maxPoints);

        scanner.close();
    }
}
