package Lab2_Magora_KI_307;
import java.util.ArrayList;
import java.util.List;

public class TV {
    private boolean powerOn;
    private int volume;
    private int currentChannel;
    private List<String> channels;
    static int count = 0;
    // Конструктор
    public TV() {
        this.powerOn = false;
        this.volume = 0;
        this.currentChannel = 3;
        this.channels = new ArrayList<>();
        this.count = this.count + 1;
     
        initializeChannels();
    }

    // Ініціалізація списку каналів
    private void initializeChannels() {
        channels.add("Новини");
        channels.add("Спорт");
        channels.add("Розваги");
        channels.add("Документальні");
        channels.add("Музика");
    }

    // Метод для увімкнення/вимкнення телевізора
    public void togglePower() {
        powerOn = !powerOn;
        System.out.println("Телевізор " + (powerOn ? "увімкнено" : "вимкнено"));
        if (!powerOn) {
            currentChannel = 1; // При вимкненні телевізора повертаємося на перший канал
        }
    }  
    // Метод для зміни гучності
    public void adjustVolume(int delta) {
        volume += delta;
        if (volume < 0) {
            volume = 0;
        } else if (volume > 100) {
            volume = 100;
        }
        System.out.println("Гучність: " + volume);
    }

    // Метод для зміни каналу за допомогою назви каналу
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

    // Метод для показу інформації про телевізор
    public void displayInfo() {
        System.out.println("Телевізор: " + (powerOn ? "увімкнено" : "вимкнено"));
        System.out.println("Гучність: " + volume);
        System.out.println("Канал " + currentChannel + ": " + channels.get(currentChannel - 1));
    }

    // Метод для отримання поточного стану телевізора
    public String getState() {
        return "Телевізор: " + (powerOn ? "увімкнено" : "вимкнено") +
                ", Гучність: " + volume +
                ", Канал " + currentChannel + ": " + channels.get(currentChannel - 1);
    }

    // Метод для отримання поточного каналу
    public String getCurrentChannel() {
        if (powerOn) {
            return channels.get(currentChannel - 1);
        } else {
            return "Телевізор вимкнено";
        }
    }

    // Метод для додавання нового каналу
    public void addChannel(String channelName) {
        if (!channels.contains(channelName)) {
            channels.add(channelName);
            System.out.println("Додано новий канал: " + channelName);
        } else {
            System.out.println("Цей канал вже існує");
        }
    }

    // Метод для видалення каналу за допомогою назви
    public void removeChannel(String channelName) {
        if (powerOn) {
            int index = channels.indexOf(channelName);
            if (index != -1) {
                channels.remove(index);
                System.out.println("Канал " + (index + 1) + ": " + channelName + " видалено");
            } else {
                System.out.println("Такого каналу не існує");
            }
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Метод для очищення списку каналів
    public void clearChannels() {
        if (powerOn) {
            channels.clear();
            System.out.println("Список каналів очищено");
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Метод для переведення на наступний канал
    public void nextChannel() {
        if (powerOn) {
            currentChannel = (currentChannel % channels.size()) + 1;
            System.out.println("Перехід на наступний канал: " + currentChannel + ": " + channels.get(currentChannel - 1));
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Метод для переведення на попередній канал
    public void previousChannel() {
        if (powerOn) {
            currentChannel = (currentChannel - 2 + channels.size()) % channels.size() + 1;
            System.out.println("Перехід на попередній канал: " + currentChannel + ": " + channels.get(currentChannel - 1));
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }
    public int getCount() {
    	return this.count;
    }
}
