// Файл Item2.java
package KI_307.Magora.Lab6;

/**
 * Клас представлення елемента для розміщення на поличці, реалізує Comparable для порівняння за ім'ям.
 */
public class Item2 implements Comparable<Item2> {
    private String name;

    /**
     * Конструктор для ініціалізації об'єкта з ім'ям.
     *
     * @param name Ім'я елемента.
     */
    public Item2(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Item2 other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Item2{" +
                "name='" + name + '\'' +
                '}';
    }
}
