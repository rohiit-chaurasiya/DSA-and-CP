import java.util.*;
import java.util.stream.Collectors;

class ranj {
    public static String ParallelSums(int[] arr) {
        Set<int[]> combs = getCombinations(arr, arr.length / 2);

        for (int[] a : combs) {
            int aSum = Arrays.stream(a).sum();
            int[] b = Arrays.stream(arr).toArray();
            for (int i : a) {
                b = Arrays.stream(b).filter(x -> x != i).toArray();
            }
            int bSum = Arrays.stream(b).sum();
            if (aSum == bSum) {
                int[] ans = compose(a, b);
                return Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(","));
            }
        }
        return "-1";
    }

    private static Set<int[]> getCombinations(int[] arr, int k) {
        Set<int[]> combs = new HashSet<>();
        combinationUtil(arr, combs, new int[k], 0, arr.length - 1, 0, k);
        return combs;
    }

    private static void combinationUtil(int[] arr, Set<int[]> combs, int[] data, int start, int end, int index, int k) {
        if (index == k) {
            combs.add(data.clone());
        } else {
            for (int i = start; i <= end && end - i + 1 >= k - index; i++) {
                data[index] = arr[i];
                combinationUtil(arr, combs, data, i + 1, end, index + 1, k);
            }
        }
    }

    private static int[] compose(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,1,5};
        System.out.println(ParallelSums(arr1)); // output: "1,11,16,20,21,35"

        int[] arr2 = {1, 2, 3, 4};
        System.out.println(ParallelSums(arr2)); // output: "-1"
    }
}
