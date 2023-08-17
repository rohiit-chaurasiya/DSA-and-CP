import java.awt.Point;
import java.util.HashMap;
import java.util.Scanner;

class acc
{

    static int maxWeightRec(int wt[], int val[], int K,
                            HashMap<Point, Integer> hm,
                            int last, int diff)
    {
        if (last == -1)
        {
            if (diff == 0)
                return 0;
            else
                return Integer.MIN_VALUE;
        }

        Point tmp = new Point(last, diff);
        if (hm.containsKey(tmp))
            return hm.get(tmp);

        hm.put(tmp,Math.max(maxWeightRec(wt, val, K, hm, last - 1, diff),
                wt[last] + maxWeightRec(wt, val, K, hm,
                        last - 1, diff + wt[last] - val[last] * K)));

        return hm.get(tmp);
    }

    static int maxWeight(int wt[], int val[], int K, int N)
    {
        HashMap<Point, Integer> hm = new HashMap<>();
        return maxWeightRec(wt, val, K, hm, N - 1, 0);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int wt[] = new int[3];
        for(int i=0;i<3;i++)
        {
            wt[i]=sc.nextInt();
        }
        int val[] = new int[3];
        for(int i=0;i<3;i++)
        {
            val[i]=sc.nextInt();
        }

        int K = sc.nextInt();

        System.out.println(maxWeight(wt, val, K, wt.length));
    }
}

