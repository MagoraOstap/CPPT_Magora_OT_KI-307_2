# Визначення класу TV для представлення основного телевізора.
class TV:
    # Конструктор класу, ініціалізує бренд, розмір та властивість powered_on.
    def __init__(self, brand, size):
        self.brand = brand
        self.size = size
        self.powered_on = False

    # Метод для увімкнення телевізора.
    def turn_on(self):
        self.powered_on = True
        print(f"{self.brand} TV is now ON.")

    # Метод для вимкнення телевізора.
    def turn_off(self):
        self.powered_on = False
        print(f"{self.brand} TV is now OFF.")

    # Метод для виведення інформації про телевізор, включаючи бренд, розмір та стан ввімкнення/вимкнення.
    def show_info(self):
        print(f"{self.brand} TV, Size: {self.size}, Powered: {'ON' if self.powered_on else 'OFF'}")
