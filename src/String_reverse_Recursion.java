import java.util.* ;
import java.io.*;

public class String_reverse_Recursion {
    static String  reverse(String str)
    {
        System.out.println(str);
        int s=0;
        int e=str.length()-1;

        if(s>=e)
            return str;
//        System.out.println( reverse(str.substring(1)) + str.charAt(0));
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] arg) {
        // Write your code here.
        String str="abcde";
        System.out.println(reverse(str));
    }
}
