// Декларація пакету для класу CalculateTheEquation, який є частиною пакету Lab4_Magora_KI_307.
package Lab4_Magora_KI_307;

// Імпорт необхідних класів Java.
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// Декларація класу CalculateTheEquation, що реалізує інтерфейс CalculateTheEquationInterface.
public class CalculateTheEquation implements CalculateTheEquationInterface {

    // Основний метод, який є точкою входу в програму.
    public static void main(String[] args) {
        // Створення екземпляру інтерфейсу CalculateTheEquationInterface.
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        
        // Виведення розрахованого результату, використовуючи введення, надане користувачем, та запис його в файл.
        System.out.println("  y=cos/tg(2x)  = " + calc.doCalculationWithInputInside());
        System.out.println("Результат був записаний у файл."); 
    }

    // Реалізація методу doCalculation із інтерфейсу CalculateTheEquationInterface.
    // Розраховує результат рівняння для заданої змінної.
    public double doCalculation(double variable) {
        try {
        	if (variable==2) {
        		throw new CustomException2("Це моє власне виключення2!");
        		
        	}
        	else
        	{
        		throw new CustomException1("Це моє власне виключення1!");
        	}
        	

        }catch (CustomException2  | CustomException1 e) {
            // Обробка арифметичного винятку, якщо воно виникає, та виведення повідомлення про помилку.
            System.out.println("Власний виняток :" + e.getMessage());
        }
        return 0; // Значення за замовчуванням, якщо виникає виняток.
    }

    // Реалізація методу doCalculationWithInputInside із інтерфейсу CalculateTheEquationInterface.
    // Отримує введення від користувача, розраховує результат та записує його в файл.
    public double doCalculationWithInputInside() {
        try {
            // Створення об'єкту Scanner для зчитування введення користувача.
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Введіть значення: ");
            
            // Зчитування значення double, введеного користувачем.
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();
            
            // Розрахунок результату рівняння для введеного значення.
            double result = Math.cos(value) / Math.tan(2 * value);

            // Запис результату в файл.
            writeResultToFile(result);

            // Повернення розрахованого результату.
            return result;
        } catch (ArithmeticException e) {
            // Обробка арифметичного винятку, якщо воно виникає, та виведення повідомлення про помилку.
            System.out.println("Арифметичний виняток: недопустиме значення.");
        } catch (InputMismatchException e) {
            // Обробка винятку введення, якщо він виникає, та виведення повідомлення про помилку.
            System.out.println("Виняток введення: недопустиме значення.");
        }
        return 0; // Значення за замовчуванням, якщо виникає виняток.
    }

    // Приватний метод для запису розрахованого результату в файл.
    private void writeResultToFile(double result) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            // Запис результату в файл.
            writer.write("Результат: " + result);
        } catch (IOException e) {
            // Обробка винятку введення-виведення, якщо він виникає, та виведення повідомлення про помилку.
            System.out.println("Помилка запису в файл: " + e.getMessage());
        }
    }
}
