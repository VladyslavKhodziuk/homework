package lesson4.homework.task4;

public class PizzaCalories {
    public static void main(String[] args) {
        int smallDiameter = 24; // Диаметр маленькой пиццы в см
        int largeDiameter = 28; // Диаметр большой пиццы в см
        int caloriesPerSquareCm = 40; // Калории в каждом квадратном сантиметре пиццы

        double smallArea = calculatePizzaArea(smallDiameter);
        double largeArea = calculatePizzaArea(largeDiameter);

        int extraCalories = (int) ((largeArea - smallArea) * caloriesPerSquareCm);

        System.out.println("При покупке пиццы диаметром " + largeDiameter + " см вместо пиццы диаметром " +
                smallDiameter + " см, будет " + extraCalories + " дополнительных калорий.");
    }

    // Метод для вычисления площади пиццы по диаметру
    public static double calculatePizzaArea(int diameter) {
        double radius = diameter / 2.0;
        return Math.PI * Math.pow(radius, 2);
    }
}
