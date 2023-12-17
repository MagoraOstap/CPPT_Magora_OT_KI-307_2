// Файл Item1.java
package KI_307.Magora.Lab6;

/**
 * Клас представлення елемента для розміщення на поличці, реалізує Comparable для порівняння.
 */
public class Item1 implements Comparable<Item1> {
    private int value;
    static int count;
    /**
     * Конструктор для ініціалізації об'єкта зі значенням.
     *
     * @param value Значення елемента.
     */
    public Item1(int value) {
        this.value = value;
        this.count += 1;
    }
    @Override
    public int compareTo(Item1 other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "Item1{" +
                "value=" + value +
                '}';
    }
}
