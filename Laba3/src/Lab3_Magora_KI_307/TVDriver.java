package KI_307_Mahora;

// Клас для демонстрації функціоналу телевізора з тюнером
public class TVDriver {
    public static void main(String[] args) {
        // Створення екземпляру телевізора з тюнером
        TVWithTuner myTV = new TVWithTuner();

        // Увімкнення та налаштування гучності
        myTV.togglePower();
        myTV.adjustVolume(5);
        myTV.displayInfo();

        // Виведення списку каналів
        myTV.listChannels();

        // Вимкнення та виведення інформації
        myTV.togglePower();
        myTV.displayInfo();

        // Зміна каналу та виведення інформації
        myTV.changeChannel("Спорт");
        myTV.displayInfo();

        // Додавання нового каналу та виведення списку каналів
        myTV.addChannel("Фільми");
        myTV.listChannels();

        // Видалення каналу та виведення списку каналів
        myTV.removeChannel("Розваги");
        myTV.listChannels();

        // Очищення списку каналів та виведення списку
        myTV.clearChannels();
        myTV.listChannels();

        // Увімкнення, перехід на певний канал та виведення інформації
        myTV.togglePower();
        myTV.tuneToChannel(2);
        myTV.displayInfo();

        // Сканування каналів
        myTV.scanChannels();
    }
}
