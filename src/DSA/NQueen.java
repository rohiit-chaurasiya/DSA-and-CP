package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class NQueen {
    static ArrayList<ArrayList<Integer>>result=new ArrayList<>();
    public static boolean isSafe(int row,int col,ArrayList<ArrayList<Integer>>chess,int n)
    {
        int x=row;
        int y=col;
        while(y>=0)
        {
            if(chess.get(x).get(y)==1)
            {
                return false;
            }
            y--;
        }

        x=row;
        y=col;
        while(x>=0 && y>=0)
        {
            if(chess.get(x).get(y)==1)
            {
                return false;
            }
            x--;
            y--;
        }

        x=row;
        y=col;
        while(x<n && y>=0)
        {
            if(chess.get(x).get(y)==1)
            {
                return false;
            }
            x+=1;
            y-=1;
        }
        return true;
    }

    public static void addSolution(ArrayList<ArrayList<Integer>>chess,int n)
    {
        result.clear();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<n;j++) {
                temp.add(chess.get(i).get(j));
            }
            result.add(temp);
        }
    }

    public static void solve(int col, ArrayList<ArrayList<Integer>>chess,int n )
    {
        if(col==n)
        {
            addSolution(chess,n);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isSafe(row,col,chess,n))
            {
                chess.get(row).set(col,1);
                solve(col+1,chess,n);
                chess.get(row).set(col,0);
            }
        }
    }

    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        ArrayList<ArrayList<Integer>>chess=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            chess.add(new ArrayList<>());
            for(int j=0;j<n;j++)
            {
                chess.get(i).add(0);
            }
        }
        for(ArrayList<Integer>row:chess)
        {
            for(int e:row)
            {
                System.out.print(e);
            }
            System.out.println();
        }

        solve(0,chess,n);

//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(result.get(i).get(j));
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer>row:result)
        {
            for(int e:row)
            {
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
