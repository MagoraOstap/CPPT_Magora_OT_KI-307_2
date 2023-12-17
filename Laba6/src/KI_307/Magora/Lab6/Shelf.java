// Файл Shelf.java
package KI_307.Magora.Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас, що представляє поличку з можливістю розміщення та опрацювання різних предметів.
 *
 * @param <T> Тип об'єктів, які можна розмістити на поличці та які реалізують Comparable для пошуку мінімального елементу.
 */
public class Shelf<T extends Comparable<T>> {
    private List<T> items;

    /**
     * Конструктор для ініціалізації порожньої полички.
     */
    public Shelf() {
        this.items = new ArrayList<>();
    }

 
    public void placeItem(T item) {
        items.add(item);
    }

    /**
     * Метод для видалення останнього елемента з полички.
     *
     * @return Видалений елемент або null, якщо поличка порожня.
     */
    public T removeItem() {
        if (items.isEmpty()) {
            System.out.println("Shelf is empty. Cannot remove item.");
            return null;
        }
        return items.remove(items.size() - 1);
    }

    /**
     * Метод для пошуку мінімального елемента на поличці.
     *
     * @return Мінімальний елемент або null, якщо поличка порожня.
     */
    public T findMinItem() {
        if (items.isEmpty()) {
            System.out.println("Shelf is empty. No minimum item.");
            return null;
        }
        return Collections.min(items);
    }

    /**
     * Метод для виведення елементів на поличці.
     */
    public void displayItems() {
        System.out.println("Items on the shelf: " + items);
    }
}
