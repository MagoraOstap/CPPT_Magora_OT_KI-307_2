package lab1;
import java.io.*;
import java.util.*;

public class Lab1_Magora_KI_307 {

    public static void main(String[] args) throws FileNotFoundException {
        // Оголошення змінних
        int nRows;
        char[][] arr;
        String filler;

        // Сканер для введення користувача
        Scanner in = new Scanner(System.in);

        // Створення файлу для виводу
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Введення користувача щодо розміру матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        // Введення користувача символу-заповнювача
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        // Перевірка, чи символ-заповнювач є одним символом
        if (filler.length() != 1) {
            System.out.print("\nНе коректний символ заповнювач");

            fout.flush();
            fout.close();

            return;
        }

        // Розрахунок правильної кількості рядків для матриці
        int correctNRows = (int) Math.floor(nRows / 2);
        arr = new char[correctNRows][];

        // Ініціалізація матриці з правильною кількістю рядків
        for (int i = 0; i < correctNRows; i++) {
            arr[i] = new char[nRows];
        }

        // Перетворення символу-заповнювача в символ
        char normalizedFiller = (char) filler.codePointAt(0);

        // Заповнення матриці та виведення її елементів
        for (int i = 0; i < correctNRows / 2; i++) {
            System.out.print("\n");
            fout.print("\n");
            System.out.print("\n");
            fout.print("\n");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = normalizedFiller;
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.print("\n");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = normalizedFiller;
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }

            System.out.print("\n");
            fout.print("\n");
        }

        // Зміна буфера та закриття PrintWriter
        fout.flush();
        fout.close();
    }
}
