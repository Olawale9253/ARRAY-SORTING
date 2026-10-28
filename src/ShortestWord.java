public class ShortestWord {

    public static String findShortestWord(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            throw new IllegalArgumentException("Sentence cannot be empty");
        }

        String[] words = sentence.trim().split("\\s+");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }

}