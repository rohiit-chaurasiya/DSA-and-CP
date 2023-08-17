import java.util.Arrays;
import java.util.Comparator;

class Sort_Mixed_Char {
    public static String sortString(String inputString)
    {
        Character tempArray[] = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }
        Arrays.sort(tempArray, new Comparator<Character>() {

            @Override
            public int compare(Character c1, Character c2)
            {
                return Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2));
            }
        });

        StringBuilder sb = new StringBuilder(tempArray.length);

        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }

    public static void main(String[] args)
    {
        String inputString = "GeeksforGeeks";

        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}
