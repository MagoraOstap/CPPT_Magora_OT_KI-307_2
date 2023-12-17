package KI_307.Magora.Lab5;

import java.io.*;

import KI.Hereha.Lab5.ResultFileManager;

public class ExpressionCalculator {

    public static double calculateExpression(double x) {
        try {
            double y = Math.cos(x) / Math.tan(2 * x);
            return y;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero");
            throw e;
        }
    }

    // Метод для запису результатів у текстовий файл
    public static void writeResultsToTextFile(String filePath, double startX, double endX, double step) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (double x = startX; x <= endX; x += step) {
                double y = calculateExpression(x);
                writer.println("x = " + x + ", y = " + y);
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to write to text file");
            e.printStackTrace();
        }
    }

    // Метод для читання результатів з текстового файлу
    public static void readResultsFromTextFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to read from text file");
            e.printStackTrace();
        }
    }

    // Метод для запису результатів у двійковий файл
    public static void writeResultsToBinaryFile(String filePath, double startX, double endX, double step) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            for (double x = startX; x <= endX; x += step) {
                double y = calculateExpression(x);
                oos.writeObject("x = " + x + ", y = " + y);
            }
        } catch (IOException e) {
            System.err.println("Error: Unable to write to binary file");
            e.printStackTrace();
        }
    }

    // Метод для читання результатів з двійкового файлу
    public static void readResultsFromBinaryFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            while (true) {
                try {
                    String result = (String) ois.readObject();
                    System.out.println(result);
                } catch (EOFException e) {
                    break; // Кінець файлу
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: Unable to read from binary file");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Тестування методів читання/запису у текстовому форматі
        String textFilePath = "text_results.txt";
        writeResultsToTextFile(textFilePath, 0, 2 * Math.PI, Math.PI / 6);
        System.out.println("Results from text file:");
        readResultsFromTextFile(textFilePath);
        

        // Тестування методів читання/запису у двійковому форматі
        String binaryFilePath = "binary_results.dat";
        writeResultsToBinaryFile(binaryFilePath, 0, 2 * Math.PI, Math.PI / 6);
        System.out.println("Results from binary file:");
        readResultsFromBinaryFile(binaryFilePath);
    }
}
