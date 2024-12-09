import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє текст, що складається з речень.
 */
class Text {
    // Список речень, що складають текст.
    private final List<Sentence> sentences;

    /**
     * Конструктор для ініціалізації тексту.
     * @param text Текст, що складається з речень.
     */
    public Text(String text) {
        sentences = new ArrayList<>();
        String normalizedText = text.replaceAll("\\s+", " ");
        String[] sentenceArray = normalizedText.split("(?<=[.!?])\\s+");
        for (String sentence : sentenceArray) {
            sentences.add(new Sentence(sentence));
        }
    }

    /**
     * Отримує список речень, що складають текст.
     */
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * Отримує текстове представлення всього тексту.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(sentence);
        }
        return sb.toString();
    }
}