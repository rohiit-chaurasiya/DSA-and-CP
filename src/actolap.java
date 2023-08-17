import java.util.HashMap;

public class actolap {
    public static String findLongestRepeatedPhrase(String input) {
        String[] words = input.split("\\s+");
        HashMap<String, Integer> phraseFrequency = new HashMap<>();

       for (int i = 0; i < words.length; i++) {
            StringBuilder phraseBuilder = new StringBuilder();
            for (int j = i; j < words.length; j++) {
                phraseBuilder.append(words[j]).append(" ");
                String phrase = phraseBuilder.toString().trim();
                phraseFrequency.put(phrase, phraseFrequency.getOrDefault(phrase, 0) + 1);
            }
        }

        int maxFrequency = 0;
        String longestPhrase = "";
        for (String phrase : phraseFrequency.keySet()) {
            int frequency = phraseFrequency.get(phrase);
            if (frequency > maxFrequency || (frequency == maxFrequency && phrase.length() > longestPhrase.length())) {
                maxFrequency = frequency;
                longestPhrase = phrase;
            }
        }

        return longestPhrase;
    }

    public static void main(String[] args) {
        String input = "make it happen actolap, solutions make it happen india, actolp make it happen";
        String result = findLongestRepeatedPhrase(input);
        System.out.println(result);
    }
}
