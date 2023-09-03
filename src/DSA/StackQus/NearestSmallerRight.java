package DSA.StackQus;

import java.util.*;

class Pair<T, U> {
    Character first;
    Integer second;

    public Pair(Character first, Integer second) {
        this.first = first;
        this.second = second;
    }
}

public class NearestSmallerRight {
    public static void main(String[] args) {
        Stack<Pair<Character,Integer>> vs = new Stack<>();
        vs.push(new Pair<>('R',4));

        System.out.println(vs.peek().first+" "+vs.peek().second);





    }
}
