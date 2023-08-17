package DSA;

public class stringBuilder {
    public static void main(String[] args)
    {
        String str="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)(i+'a');
            str=str+ch;
        }
        System.out.println(str);
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)(i+'a');
            builder.append(ch);
        }
        System.out.println(builder);




    }
}
