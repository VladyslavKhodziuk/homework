package lesson5.homework;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();

        int seconds = random.nextInt(28801);
        System.out.println("Секунды: " + seconds);
        displayHours(seconds);
    }

    public static void displayHours(int seconds) {
        int hours = seconds / 3600;

        if (hours >= 1) {
            System.out.println("Осталось " + hours + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}

