import java.util.*;

public class Program_4 {
    public static Map<Integer, Integer> solve(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (Integer number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> numbers = List.of(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);

        Map<Integer, Integer> countMap = solve(numbers);

        System.out.println(countMap);
    }
}
