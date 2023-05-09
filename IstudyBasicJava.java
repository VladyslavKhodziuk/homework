package lesson3.homework3.task2;

public class IstudyBasicJava {

    public static void main(String[] args) {
 // Первый способ:
       String study = new String ("I study Basic Java!") ;
        System.out.println(study.charAt(18));
        System.out.println(study.contains("Java"));
        System.out.println(study.replace('a', 'o'));
        System.out.println(study.contains("Java"));
        System.out.println(("Строка в верхнем регистре: ") + study.toUpperCase());

//  Второй способ:
        String lowerCaseStr = study.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        String substring = study.substring(study.indexOf("Java"), study.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная подстрока: " + substring);

    }
}
