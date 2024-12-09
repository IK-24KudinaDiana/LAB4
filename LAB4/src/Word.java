import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє слово, яке складається з літер.
 */
class Word {
    // Список літер, що складають слово.
    private final List<Letter> letters;

    /**
     * Конструктор для ініціалізації слова.
     * @param word Текстове слово, яке складається з символів.
     */
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Отримує список літер, які складають це слово.
     */
    public List<Letter> getLetters() {
        return letters;
    }

    /**
     * Підраховує кількість входжень заданої літери в слові.
     * @param targetLetter Літера, яку потрібно порахувати.
     * @return Кількість входжень літери.
     */
    public int countOccurrences(char targetLetter) {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.getValue() == targetLetter) {
                count++;
            }
        }
        return count;
    }

    /**
     * Отримує текстове представлення слова.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getValue());
        }
        return sb.toString();
    }
}