package lesson3.homework3.game.hero;

import lesson3.homework3.task0.Numbers;

public class Elf {
    private static int id = 5225;
    private static int power = 9;
    private static int health = 10;
    private static int charisma = 7;
    private static int magic = 1;
    private static String name = "One";

    public static void main(String[] args) {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("power: " + power);
        System.out.println("health: " + health);
        System.out.println("charisma: " + charisma);
        System.out.println("magic: " + magic);
        int id = getId(59598);
    }

    // Getter и Setter для поля id
    public static int getId(int first) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
      }
    }

