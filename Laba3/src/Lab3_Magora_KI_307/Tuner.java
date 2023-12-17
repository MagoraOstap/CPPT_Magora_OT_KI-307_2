package KI_307_Mahora;

import java.util.List;

// Інтерфейс Tuner для взаємодії з тюнером телевізора
public interface Tuner {
    // Метод для переходу на певний канал за його номером
    void tuneToChannel(int channelNumber);
    
    // Метод для сканування каналів
    void scanChannels();
    
    // Метод для додавання нового каналу
    void addChannel(String channelName);
    
    // Метод для видалення каналу за його іменем
    void removeChannel(String channelName);
    
    // Метод для очищення списку каналів
    void clearChannels();
}
