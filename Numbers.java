package lesson3.homework3.task0;

public class Numbers {
    public static void main(String[] args) {

//  Перевести 637 из десятичной в шестнадцатиричную
        int decimal = 637;
        String hex = Integer.toHexString(decimal);
        System.out.println("Шестнадцатеричное представление: " + hex);
//  Oбратно
        String hex1 = "27D";
        int decimal1 = Integer.parseInt(hex1, 16);
        System.out.println("Десятичное представление: " + decimal1);

//  Перевести 637 из десятичной в двоичную
        int decimal_1 = 637;
        String binary = Integer.toBinaryString(decimal_1);
        System.out.println("Двоичное представление: " + binary);

//  11100111 перевести в десятичную
        String binary_1 = "11100111";
        int decimal_2 = Integer.parseInt(binary_1, 2);
        System.out.println("Десятичное представление: " + decimal_2);

//  Перевести 637 из десятичной в троичную
        int decimal_3 = 637;
        String ternary = Integer.toString(decimal_3, 3);
        System.out.println("Троичное представление: " + ternary);

    }

}
