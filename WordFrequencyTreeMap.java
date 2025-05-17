import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyTreeMap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency (Sorted): " + wordCount);
    }
}
