import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iastest2 {

    public static void extractNumbersWithoutNine(String input) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(input);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String number = matcher.group();
            if (!number.contains("9")) {
                result.append(number).append(" ");
            }
        }

        String extractedNumbers = result.toString().trim();

        System.out.println(extractedNumbers);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        extractNumbersWithoutNine(input1);
    }
}

