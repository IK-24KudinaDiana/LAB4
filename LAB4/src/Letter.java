/**
 * Клас, що представляє одну літеру.
 */
class Letter {
    // Літера, яка зберігається у вигляді символа.
    private final char value;

    /**
     * Конструктор для ініціалізації літери.
     * @param value Символ, який представляє літеру.
     */
    public Letter(char value) {
        this.value = value;
    }

    /**
     * Отримує значення літери.
     */
    public char getValue() {
        return value;
    }
}