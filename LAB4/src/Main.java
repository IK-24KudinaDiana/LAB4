import java.util.List;
import java.util.Scanner;

/**
 * Основний клас для обробки вводу та виконання сортування тексту.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        System.out.print("Enter the letter for sorting: ");
        char targetLetter = scanner.next().charAt(0);

        Text text = new Text(inputText);
        List<Sentence> sentences = text.getSentences();

        for (Sentence sentence : sentences) {
            List<Word> words = sentence.getWords();
            words.sort((w1, w2) -> Integer.compare(w1.countOccurrences(targetLetter), w2.countOccurrences(targetLetter)));
        }

        System.out.println("Sorted text: " + text);
    }
}
