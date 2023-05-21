package lesson5.homework;

public class Main {

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain;
        System.out.println("Я могу пойти гулять: " + canWalk);

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду: " + canBuy);

        int temperature1 = 120;
        int temperature2 = 80;

        boolean deviceWorks = checkDevice(temperature1, temperature2);
        System.out.println("Устройство работает: " + deviceWorks);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
}

