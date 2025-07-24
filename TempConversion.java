import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp, newTemp;
        char celsius, fahrenheit;
        int choice;

        System.out.println("1. Convert Celsius(C) to fahrenheit(F)");
        System.out.println("2. Convert Fahrenheit(F) to Celsius(C)");

        System.out.print("\nEnter your choice : ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("\nEnter the temperature (C) : ");
            temp = scanner.nextDouble();

            newTemp = ((double) 9 / 5 * temp) + 32;

            System.out.printf("%f C = %f F", temp, newTemp);
        } else if (choice == 2) {
            System.out.print("\nEnter the temperature (F) : ");
            temp = scanner.nextDouble();

            newTemp = (temp - 32) * ((double) 5 / 9);

            System.out.printf("%f F = %f C", temp, newTemp);
        } else {
            System.out.println("Invalid Choice!");
        }

        scanner.close();
    }
}


