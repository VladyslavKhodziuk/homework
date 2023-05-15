package lesson4.homework.task1;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.next();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.next();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            // Формирование нового слова из половин первого и второго слова
            String newWord = word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
            System.out.println("Новое слово: " + newWord);
        } else {
            System.out.println("Ошибка: слова должны иметь четное количество букв.");
        }
    }
}

