
import java.awt.Point;
        import java.util.HashMap;

class accc
{
    // memoized recursive method to return maximum
    // weight with K as ratio of weight and values
    static int maxWeightRec(int wt[], int val[], int K,
                            HashMap<Point, Integer> hm,
                            int last, int diff)
    {
        // base cases : if no item is remaining
        if (last == -1)
        {
            if (diff == 0)
                return 0;
            else
                return Integer.MIN_VALUE;
        }

        // first make pair with last chosen item and
        // difference between weight and values
        Point tmp = new Point(last, diff);
        if (hm.containsKey(tmp))
            return hm.get(tmp);

		/* choose maximum value from following two
			1) not selecting the current item and calling
			recursively
			2) selection current item, including the weight
			and updating the difference before calling
			recursively */
        hm.put(tmp,Math.max(maxWeightRec(wt, val, K, hm, last - 1, diff),
                wt[last] + maxWeightRec(wt, val, K, hm,
                        last - 1, diff + wt[last] - val[last] * K)));

        return hm.get(tmp);
    }

    // method returns maximum sum of weight with K
    // as ration of sum of weight and their values
    static int maxWeight(int wt[], int val[], int K, int N)
    {
        HashMap<Point, Integer> hm = new HashMap<>();
        return maxWeightRec(wt, val, K, hm, N - 1, 0);
    }

    // Driver method
    public static void main(String args[])
    {
        int wt[] = {20,30,10};
        int val[] = {100,120,60};

        int K = 50;

        System.out.println(maxWeight(wt, val, K, wt.length));
    }
}
// This code is contributed by Gaurav Miglani
