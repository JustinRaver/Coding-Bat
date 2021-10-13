package String2;

/**
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
 * <p>
 * <p>
 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 * repeatSeparator("This", "And", 2) → "ThisAndThis"
 * repeatSeparator("This", "And", 1) → "This"
 */
public class RepeatSeperator {
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < count - 1; i++) {
            stringbuilder.append(word);
            stringbuilder.append(sep);
        }
        return stringbuilder + word;
    }
}
