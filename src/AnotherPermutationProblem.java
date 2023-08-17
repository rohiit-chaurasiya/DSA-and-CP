import java.util.*;

public class AnotherPermutationProblem {
    public static long calculateCost(int[] permutation) {
        int n = permutation.length;
        long sum = 0;
        long maxTerm = Long.MIN_VALUE;

        for (int i = 0; i <n; i++) {
            sum += (long) permutation[i] * (i + 1);
            maxTerm = Math.max(maxTerm, (long) permutation[i] * (i + 1));
        }

        return sum - maxTerm+permutation[n - 1];
    }

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int kiet = in.nextInt();
        if (kiet >= 1) {
            while (kiet-- > 0) {
                int len = in.nextInt();
                int[] permutation=new int[len];
                if (len >= 2) {
                    for (int i = 0; i <len-2; i++) {

                        permutation[i] =i+1;
                    }
//                    System.out.println((len-1)+" "+(len));
                    permutation[len-1]=len-1;
                    permutation[len-2]=len;
//                    System.out.println((permutation[0])+" "+(permutation[1]));

                    long cost = calculateCost(permutation);
                    System.out.println(cost);

                }
            }
        }
    }



}
