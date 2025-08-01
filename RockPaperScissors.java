import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /* STEPS TO CREATE GAME :
                        1.WELCOME MESSAGE
                        2.DECLARE VARS
                        3.CREATE RANDOM CLASS
                        4.TAKE USER INPUT FOR MOVE
                        5.TAKE COMPUTERS INPUT USING RANDOM CLASS
                        6.COMPARE USER'S INPUT & COMPUTER'S INPUT
                        7.DISPLAY RESULT (WIN/LOOSE)
                        8.CREATE LOOP TO PLAY AGAIN OR NO
                        9.If no print an "Exit" message.
         */

        System.out.println("*****WELCOME TO THE GAME!*****\n");


        String[] moves = {"rock", "paper", "scissors"};
        String choice, comChoice;
        String playAgain = "Y";

        do {
            System.out.print("\nEnter your move (rock,paper,scissors) : ");
            choice = scanner.nextLine().toLowerCase();     //"to lowerCase() in case a user types in an upper case "rock".

            if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {

                System.out.println("Invalid Choice!Choose again");
                continue;
            }
            comChoice = moves[random.nextInt(0, 3)];

            System.out.printf("Computer's choice = %s", comChoice);

            if (choice.equals(comChoice)) {
                System.out.println("\nTIE!");
            } else if ((choice.equals("rock") && comChoice.equals("scissors")) ||
                    (choice.equals("paper") && comChoice.equals("rock")) ||
                    (choice.equals("scissors") && comChoice.equals("paper"))) {
                System.out.println("\nYOU WIN!");
            } else {
                System.out.println("\nYOU LOSE!");
            }
            System.out.print("\nDo you want to play again (Y/N)? : ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("y"));

        System.out.println("\n*****THANKS FOR PLAYING!*****");

        scanner.close();
    }
}
