import java.util.Scanner;

public class RudolphTicTacToe {
    public static String solve(String row1, String row2, String row3) {
        if (row1.equals("XXX") || row2.equals("XXX") || row3.equals("XXX"))
            return "X";
        if (row1.equals("OOO") || row2.equals("OOO") || row3.equals("OOO"))
            return "O";
        if (row1.equals("+++") || row2.equals("+++") || row3.equals("+++"))
            return "+";

        // Check vertical rows
        if (row1.charAt(0) == 'X' && row2.charAt(0) == 'X' && row3.charAt(0) == 'X')
            return "X";
        if (row1.charAt(0) == 'O' && row2.charAt(0) == 'O' && row3.charAt(0) == 'O')
            return "O";
        if (row1.charAt(0) == '+' && row2.charAt(0) == '+' && row3.charAt(0) == '+')
            return "+";
        if (row1.charAt(1) == 'X' && row2.charAt(1) == 'X' && row3.charAt(1) == 'X')
            return "X";
        if (row1.charAt(1) == 'O' && row2.charAt(1) == 'O' && row3.charAt(1) == 'O')
            return "O";
        if (row1.charAt(1) == '+' && row2.charAt(1) == '+' && row3.charAt(1) == '+')
            return "+";
        if (row1.charAt(2) == 'X' && row2.charAt(2) == 'X' && row3.charAt(2) == 'X')
            return "X";
        if (row1.charAt(2) == 'O' && row2.charAt(2) == 'O' && row3.charAt(2) == 'O')
            return "O";
        if (row1.charAt(2) == '+' && row2.charAt(2) == '+' && row3.charAt(2) == '+')
            return "+";

        // Check diagonal rows
        if (row1.charAt(0) == 'X' && row2.charAt(1) == 'X' && row3.charAt(2) == 'X')
            return "X";
        if (row1.charAt(0) == 'O' && row2.charAt(1) == 'O' && row3.charAt(2) == 'O')
            return "Noughts win";
        if (row1.charAt(0) == '+' && row2.charAt(1) == '+' && row3.charAt(2) == '+')
            return "+";
        if (row1.charAt(2) == 'X' && row2.charAt(1) == 'X' && row3.charAt(0) == 'X')
            return "X";
        if (row1.charAt(2) == 'O' && row2.charAt(1) == 'O' && row3.charAt(0) == 'O')
            return "Noughts win";
        if (row1.charAt(2) == '+' && row2.charAt(1) == '+' && row3.charAt(0) == '+')
            return "+";

        // No winner
        return "Draw";

    }

    public static void main(String[] arg)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t>=1 && t<=10000) {
            while (t-- > 0) {
                String row1 = in.next();
                String row2 = in.next();
                String row3 = in.next();
                String result=solve(row1,row2,row3);
                System.out.println(result);





            }
        }
    }
}
