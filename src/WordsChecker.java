import java.util.*;

public class WordsChecker {
    protected String text;
    protected Set<String> wordsSet;
    protected String[] words;

    public WordsChecker(String text) {
        this.text = text;
        makeWords(text);
    }

    protected void makeWords(String text) {
        wordsSet = new HashSet<>();
        words = text.split("\\P{IsAlphabetic}+");
        for (int i = 0; i < words.length; i++) {
            wordsSet.add(words[i]);
        }
    }

    public boolean hasWord(String word) {
        if (wordsSet.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}
