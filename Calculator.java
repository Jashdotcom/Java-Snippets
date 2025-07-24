import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1,num2,sum = 0,sub = 0,mult = 0,div = 0;
        int choice=0;

        while (choice != 5) {
            System.out.println("\n1. +\n2. -\n3. *\n4. /\n5. Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("\nEnter first number : ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number : ");
                num2 = scanner.nextDouble();

                sum = num1 + num2;
                System.out.printf("\n%f + %f = %f\n", num1, num2, sum);
            }
            else if (choice == 2) {
                System.out.print("\nEnter first number : ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number : ");
                num2 = scanner.nextDouble();

                sub = num1 - num2;
                System.out.printf("\n%f - %f = %f\n", num1, num2, sub);
            }
            else if (choice == 3) {
                System.out.print("\nEnter first number : ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number : ");
                num2 = scanner.nextDouble();

                mult = num1 * num2;
                System.out.printf("\n%f * %f = %f\n", num1, num2, mult);
            }
            else if (choice == 4) {
                System.out.print("\nEnter first number : ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number : ");
                num2 = scanner.nextDouble();

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    div = num1 / num2;
                    System.out.printf("\n%f / %f = %f\n", num1, num2, div);
                }
            }
            else if (choice == 5) {
                System.out.println("Exited Successfully!");
            }
            else {
                System.out.println("Invalid Choice! Choose again.");
            }
        }

        scanner.close();
    }
}
