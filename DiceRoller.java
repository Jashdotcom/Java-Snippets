import java.util.Scanner;
import java.util.Random;

public class DiceRoller{

    public static void main(String[] args) {

        //Dice Roller Program to print dice rolled using ASCII Art

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numOfDice, total = 0;

        System.out.print("Enter number of dice to be rolled : ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled : " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("Total : " + total);
        } else {
            System.out.println("\nNumber of Dice must be greater than zero!");
        }
        scanner.close();

    }

    static void printDie(int roll) {

        //Inorder to print ASCII art we need to create multi line string.
        //Right in the middle of the string created , we are going to add a bullet point.
        //The easiest way to do this is to pull up with charMap application. (Hold windows & type 'R' & select bullet point by scrolling all the way down).
        //Also you can search on google & copy that as well.

        String dice1 = """ 
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                
                
                """;

        String dice2 = """ 
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                
                
                """;
        String dice3 = """ 
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                
                
                """;
        String dice4 = """ 
                 -------
                | ●    ● |
                |        |
                | ●    ● |
                 -------
                
                
                """;
        String dice5 = """ 
                 -------
                | ●    ● |
                |   ●    |
                | ●    ● |
                 -------
                
                
                """;
        String dice6 = """ 
                 -------
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 -------
                
                
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid Roll!");

        }
    }
}





