import math
import pickle

# Функція для обчислення виразу за заданим значенням x.
def calculate_expression(x):
    try:
        result = math.cos(x) / math.tan(2 * x)
        return result
    except ZeroDivisionError:
        print("Error: tan(2x) is undefined when cos(x) = 0.")
        return None

# Функція для збереження даних у текстовий файл.
def save_to_text_file(filename, data):
    with open(filename, 'w') as file:
        for item in data:
            file.write(str(item) + '\n')

# Функція для збереження даних у бінарний файл за допомогою pickle.
def save_to_binary_file(filename, data):
    with open(filename, 'wb') as file:
        pickle.dump(data, file)

# Функція для зчитування даних з текстового файлу.
def read_from_text_file(filename):
    data = []
    try:
        with open(filename, 'r') as file:
            for line in file:
                data.append(float(line.strip()))
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
    return data

# Функція для зчитування даних з бінарного файлу, збереженого за допомогою pickle.
def read_from_binary_file(filename):
    data = []
    try:
        with open(filename, 'rb') as file:
            data = pickle.load(file)
    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")
    return data

# Головна частина програми.
if __name__ == "__main__":
    # Задані значення x для обчислення виразу.
    x_values = [0.1, 0.2, 0.3, 0.4, 0.5]

    # Обчислення результатів для кожного значення x.
    results = [calculate_expression(x) for x in x_values]

    # Збереження результатів у текстовий і бінарний файли.
    save_to_text_file("results.txt", results)
    save_to_binary_file("results.dat", results)

    # Зчитування даних з обох файлів.
    text_data = read_from_text_file("results.txt")
    binary_data = read_from_binary_file("results.dat")

    # Виведення результатів на екран.
    print("Results from text file:", text_data)
    print("Results from binary file:", binary_data)
