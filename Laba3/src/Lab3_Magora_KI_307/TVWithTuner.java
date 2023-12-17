package KI_307_Mahora;

import java.util.ArrayList;
import java.util.List;

public class TVWithTuner extends AbstractTV implements Tuner, SecondInterface{

    // Перевизначений метод для переходу на певний канал
    @Override
    public void tuneToChannel(int channelNumber) {
        // Перевірка, чи телевізор увімкнено
        if (powerOn) {
            // Перевірка, чи номер каналу знаходиться в межах допустимого діапзону
            if (channelNumber >= 1 && channelNumber <= channels.size()) {
                currentChannel = channelNumber;
                System.out.println("Перехід на канал: " + currentChannel + ": " + channels.get(currentChannel - 1));
            } else {
                System.out.println("Такого каналу не існує");
            }
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Перевизначений метод для сканування каналів
    @Override
    public void scanChannels() {
        // Перевірка, чи телевізор увімкнено
        if (powerOn) {
            System.out.println("Сканування каналів...");
            // Логіка сканування каналів розташована тут
            System.out.println("Сканування завершено");
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }

    // Перевизначений метод для додавання нового каналу
    @Override
    public void addChannel(String channelName) {
        // Перевірка, чи канал з таким ім'ям відсутній в списку
        if (!channels.contains(channelName)) {
            channels.add(channelName);
            System.out.println("Додано новий канал: " + channelName);
        } else {
            System.out.println("Цей канал вже існує");
        }
    }

    // Перевизначений метод для видалення каналу
    @Override
    public void removeChannel(String channelName) {
        // Перевірка, чи телевізор увімкнено
        if (powerOn) {
            // Знаходження індексу каналу в списку
            int index = channels.indexOf(channelName);
            // Перевірка, чи канал існує в списку
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

    // Перевизначений метод для очищення всіх каналів
    @Override
    public void clearChannels() {
        // Перевірка, чи телевізор увімкнено
        if (powerOn) {
            channels.clear();
            System.out.println("Список каналів очищено");
        } else {
            System.out.println("Телевізор вимкнено");
        }
    }
}
