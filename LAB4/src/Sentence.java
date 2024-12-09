import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє речення, яке складається з слів.
 */
class Sentence {
    // Список слів, що складають це речення.
    private final List<Word> words;

    /**
     * Конструктор для ініціалізації речення.
     * @param sentence Текстове представлення речення.
     */
    public Sentence(String sentence) {
        words = new ArrayList<>();
        String[] wordArray = sentence.split("\\s+");
        for (String word : wordArray) {
            words.add(new Word(word));
        }
    }

    /**
     * Отримує список слів, що складають це речення.
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Отримує текстове представлення всього речення.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word word : words) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }
}