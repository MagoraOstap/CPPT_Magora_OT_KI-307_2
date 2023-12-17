// Файл Main.java (програма-драйвер)
package KI_307.Magora.Lab6;

/**
 * Головний клас для використання та демонстрації класів Shelf, Item1 та Item2.
 */
public class Main {
    public static void main(String[] args) {
        // Створення полички та розміщення елементів
        Shelf<Item1> shelf1 = new Shelf<>();
        shelf1.placeItem(new Item1(10));
        shelf1.placeItem(new Item1(5));
        shelf1.placeItem(new Item1(8));

        // Вивід мінімального елемента на поличці
        System.out.println("Minimum item on Shelf1: " + shelf1.findMinItem());

        // Створення іншої полички та розміщення елементів
        Shelf<Item2> shelf2 = new Shelf<>();
        shelf2.placeItem(new Item2("Book"));
        shelf2.placeItem(new Item2("Pen"));
        shelf2.placeItem(new Item2("Notebook"));

        // Вивід мінімального елемента на іншій поличці
        System.out.println("Minimum item on Shelf2: " + shelf2.findMinItem());
        main1();
        System.out.println("Кількість предметів "+Item1.count);
    }
    public static void main1() {
        Shelf<Item1> shelf1 = new Shelf<>();
        shelf1.placeItem(new Item1(10));
	
    }
}
