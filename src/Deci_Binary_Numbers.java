/*
1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.

Example 1:
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32
*/


import java.util.Scanner;
import java.lang.*;

public class Deci_Binary_Numbers {
    public static void main(String[] arg)
    {
        Scanner scan =new Scanner(System.in);
        String n=scan.nextLine();
//        int num=Integer.parseInt(n);
        int result=0;
        for(int i=0;i<n.length();i++)
        {
//            result=Math.max(result,n.charAt(i)-'0');
            result=n.charAt(i)-'0';
            System.out.println(result);
        }
//        System.out.println(result);
    }

}
