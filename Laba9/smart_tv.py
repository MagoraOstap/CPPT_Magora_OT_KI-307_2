# smart_tv.py

# Імпорт базового класу TV з модуля tv.
from tv import TV

# Визначення класу SmartTV, який успадковує властивості та методи класу TV.
class SmartTV(TV):
    # Конструктор класу SmartTV, який викликає конструктор класу TV та додає новий параметр tuner_type.
    def __init__(self, brand, size, tuner_type):
        super().__init__(brand, size)
        self.tuner_type = tuner_type

    # Перевизначення методу show_info класу TV для додавання інформації про тип тюнера смарт-телевізора.
    def show_info(self):
        # Виклик методу show_info класу TV за допомогою super().
        super().show_info()
        # Виведення інформації про тип тюнера смарт-телевізора.
        print(f"Tuner Type: {self.tuner_type}")
