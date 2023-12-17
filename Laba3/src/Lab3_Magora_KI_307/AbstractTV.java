package KI_307_Mahora;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTV {
    // Поле, що вказує, чи увімкнено телевізор
    protected boolean powerOn;
    
    // Поле, що визначає рівень гучності
    protected int volume;
    
    // Поле, що визначає номер поточного каналу
    protected int currentChannel;
    
    // Список каналів
    protected List<String> channels;

    // Конструктор класу, ініціалізує початкові значення
    public AbstractTV() {
        this.powerOn = false;
        this.volume = 0;
        this.currentChannel = 3;
        this.channels = new ArrayList<>();
        initializeChannels();  // Ініціалізує список каналів
    }

    // Приватний метод для ініціалізації списку каналів
    private void initializeChannels() {
        channels.add("Новини");
        channels.add("Спорт");
        channels.add("Розваги");
        channels.add("Документальні");
        channels.add("Музика");
    }

    // Метод для перемикання телевізора
    public void togglePower() {
        powerOn = !powerOn;
        System.out.println("Телевізор " + (powerOn ? "увімкнено" : "вимкнено"));
        if (!powerOn) {
            currentChannel = 1;
        }
    }

    // Метод для регулювання гучності
    public void adjustVolume(int delta) {
        volume += delta;
        if (volume < 0) {
            volume = 0;
        } else if (volume > 100) {
            volume = 100;
        }
        System.out.println("Гучність: " + volume);
    }

    // Метод для зміни каналу за назвою
    public void changeChannel(String channelName) {
        if (powerOn) {
            int index = channels.indexOf(channelName);
            if (index != -1) {
                currentChannel = index + 1;
                System.out.println("Канал " + currentChannel + ": " + channels.get(index));
            } else {
                System.out.println("Такого каналу не існує");
            }
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Метод для виведення списку каналів
    public void listChannels() {
        System.out.println("Список каналів:");
        for (int i = 0; i < channels.size(); i++) {
            System.out.println((i + 1) + ". " + channels.get(i));
        }
    }

    // Метод для виведення інформації про телевізор
    public void displayInfo() {
        System.out.println("Телевізор: " + (powerOn ? "увімкнено" : "вимкнено"));
        System.out.println("Гучність: " + volume);
        System.out.println("Канал " + currentChannel + ": " + channels.get(currentChannel - 1));
    }

    // Абстрактний метод для переходу на певний канал
    public abstract void tuneToChannel(int channelNumber);

    // Абстрактний метод для сканування каналів
    public abstract void scanChannels();
}
