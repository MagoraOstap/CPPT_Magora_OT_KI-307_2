package laKI_307_Mahora;

import laKI_307_Mahora.String;
import laKI_307_Mahora.TV;

public class TVDriver {
    public static void main(String[] args) {
        TV myTV = new TV();
        
        myTV.togglePower();
        myTV.adjustVolume(5);
        myTV.displayInfo();

        myTV.listChannels(); // Додано виведення списку каналів

        myTV.togglePower();
        myTV.displayInfo();

        myTV.changeChannel("Спорт"); // Змінено канал за допомогою назви каналу
        myTV.displayInfo();

        // Додано використання нових методів
        myTV.addChannel("Фільми");
        myTV.listChannels();

        myTV.removeChannel("Розваги");
        myTV.listChannels();

        myTV.clearChannels();
        myTV.listChannels();

        myTV.togglePower();
        myTV.nextChannel(); // Перехід на наступний канал
        myTV.displayInfo();

        myTV.previousChannel(); // Перехід на попередній канал
        myTV.displayInfo();
        main1();
        int count = myTV.getCount();
        System.out.println("Count=" + count);
    }
    public static void main1() {
        TV myTV = new TV();}
}
