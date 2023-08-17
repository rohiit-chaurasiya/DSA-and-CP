import java.util.*;

public class aad {

    public static String StringChallenge(String str)
    {
        int breakpoint = str.indexOf(' ');
        String wildCard = str.substring(0, breakpoint);
        String result = str.substring(breakpoint + 1);
        int index = 0;
        int step = 0;
        while (index < wildCard.length()) {
            if (wildCard.charAt(index) == '+')
            {
                step++;
            }
            else if (wildCard.charAt(index) == '*')
            {
                int sequenceLength = 3;
                if (index + 1 < wildCard.length())
                {
                    if (wildCard.charAt(index + 1) == '{')
                    {
                        String num = "";
                        while (wildCard.charAt(index) != '}')
                        {
                            if (wildCard.charAt(index) >= '0' && wildCard.charAt(index) <= '9')
                            {
                                num += wildCard.charAt(index);
                            }
                            index++;
                        }
                        sequenceLength = Integer.parseInt(num);
                    }
                }
                if (step + sequenceLength-1 > result.length()) {
                    return "false";
                } else {
                    char tempChar = result.charAt(step);
                    while (sequenceLength > 0) {
                        if (result.charAt(step) != tempChar) {
                            return "false";
                        }
                        sequenceLength--;
                        step++;
                    }
                }
            }
            index++;
        }
        if (step != result.length()) {
            return "false";
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(StringChallenge("$**+*{2} 9mmmrrrkbb"));
        System.out.println(StringChallenge("+++++* abcdemmmmmm"));
        System.out.println(StringChallenge("**+*{2} mmmrrrkbb"));
    }
}

