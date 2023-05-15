package lesson4.homework.task3;

public class Convert {

        public static void main(String[] args) {
            double euroAmount = 100.0;
            double usdAmount = convertToUSD(euroAmount);
            System.out.println(euroAmount + " евро = " + usdAmount + " долларов США");
        }

        public static double convertToUSD(double euroAmount) {
            double conversionRate = 1.18;
            return euroAmount * conversionRate;
        }
    }

