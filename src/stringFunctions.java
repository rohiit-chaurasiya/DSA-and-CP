public class stringFunctions {
    public static void main(String[] arg)
    {
        String str1="GeekForGeeksGeekaGeek";
        String str2="Geek";
        System.out.println(str1.contains(str2));
        String str3="Geek";
        System.out.println(str2.equals(str3));

        if(str2.equals(str3))
        {
            System.out.println("True");
        }
        int res=str1.compareTo(str2);
        System.out.println(res);
        if(res>1)
        {
            System.out.println("Same");
        }
        if(res>0)
        {
            System.out.println("Is Greater");
        }
        if(res<0)
        {
            System.out.println("Smaller");
        }

        //-------------indexOf()------------//
        System.out.println(str1.indexOf(str2,8));


    }
}
