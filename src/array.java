import java.util.*;
public class array {
    public static void main(String [] arg)
    {
        String [] arr={"amazon","apple","facebook","google","leetcode"};
        Map<Character,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            for(int j=0;j<s.length();j++) {
                if (map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                } else {
                    map.put(s.charAt(j), 1);
                }
            }
        }
//        String str="abce";
//        String s=str.charAt(3);
//        System.out.println(map.containsKey(str.charAt(3)));
        System.out.println(map.get('a'));

//        for(Map.Entry<Character, Integer>e:map.entrySet())
//        {
//            System.out.println(e.getKey()+" "+e.getValue());
//        }

//        String str[]={"amazon","apple","facebook","google","leetcode"};
//        Arrays.toString(str);
//        String str1=str[0];
//
//        System.out.println(str1.charAt(0));
    }

}
