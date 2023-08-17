import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Monsters {
    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.first == other.first) {
                return Integer.compare(this.second, other.second);
            }
            return Integer.compare(this.first, other.first);
        }
    }

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int b = in.nextInt();
            int c = in.nextInt();
            if (b >= 1) {
                Set<Pair> set = new TreeSet<>();
                ArrayList<Integer>arr=new ArrayList<>();
                for(int i=1;i<=b;i++)
                {
                    int temp=0;
                    arr.add(in.nextInt());
                    temp%=c;
                    set.add(new Pair(temp, i));
                }
                for (Pair p : set) {
                    System.out.print(p.second + " ");
                }
                System.out.println();
            }
        }
    }
}
