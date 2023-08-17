public class CheckPalindrome_recursion {
    static boolean check(String str,int i,int j)
    {
        if(i>j)
            return true;

        if(str.charAt(i)!=str.charAt(j))
            return false;

        return check(str,i+1,j-1);

    }
    public static void main(String[] arg)
    {
        String str="abbccbba";
        boolean ans=check(str,0,str.length()-1);
        if(ans)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
