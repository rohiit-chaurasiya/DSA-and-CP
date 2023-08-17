import java.util.*;

import java.util.*;

public class mon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] health = new int[n];
            for (int i = 0; i < n; i++) {
                health[i] = sc.nextInt();
            }
            List<Integer> order = getMonsterDeathOrder(health, k);
            for (int i : order) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> getMonsterDeathOrder(int[] health, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> health[b] - health[a]);
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < health.length; i++) {
            pq.offer(i);
        }

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < k && !pq.isEmpty(); i++) {
                int monsterIndex = pq.poll();
                if (health[monsterIndex] > 0) {
                    health[monsterIndex] = 0;
                    temp.add(monsterIndex);
                }
            }
            order.addAll(temp);
            for (int i : temp) {
                if (health[i] > 0) {
                    pq.offer(i);
                }
            }
        }

        return order;
    }
}
