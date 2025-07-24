import java.util.Scanner;

public class ShoppingCart{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price,total;
        int quantity;

        System.out.print("What item would you like to buy ? : ");
        item = scanner.nextLine();

        System.out.print("What is the price for each ($) ? : ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to buy ? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou bought " + quantity + " " + item + "/s");
        System.out.println("Your total is : " + "$" + total);

        scanner.close();
    }
}