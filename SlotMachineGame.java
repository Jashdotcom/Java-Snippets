import java.util.Scanner;
import java.util.Random;

public class SlotMachineGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /* STEPS TO CREATE GAME :
        1.PRINT A WELCOME MSG
        2.DECLARE VARS
        3.PRINT SYMBOLS
        4.PRINT CURRENT BAL
        5.ASK USER TO INPUT THE BET AMOUNT
        6.PRINT THE BET AMOUNT
        7.SPIN i.e. USE RANDOM CLASS
        8.CHECK USING LOOP IF ANY TWO SYMBOLS ARE SAME
        9.IF SO PRINT THE AMOUNT WON BY THE USER
        10.IF NOT PRINT "SORRY YOU LOST"
        11.AT THE END ASK USER IF THEY WANT TO PLAY AGAIN.
        12.IF CURRENT BALANCE = 0, END GAME
         */

        System.out.println("******WELCOME TO SLOT MACHINE******\n");

        float currBal = 100, amt, payout = 50, jackpot = 100;



        String[] symbols = {"🍒","🍉","🍋","🔔","⭐"};
        String symbol1, symbol2, symbol3;
        String playAgain = "y";

        System.out.print("------------------------------");
        System.out.print("\nSymbols : ");
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i] + " ");
        }
        System.out.print("\n------------------------------");

        do {
            if (currBal == 0) {
                System.out.println("\nYour balance is $0.You cannot play further.Game Over!");
                break;
            }

            System.out.printf("\nYour current balance is : $%.2f", currBal);

            System.out.print("\nEnter the bet amount ($) : ");
            amt = scanner.nextFloat();
            scanner.nextLine(); // Consume the leftover newline

            if (amt > currBal) {
                System.out.println("Your bet amount is more than your current balance.");
            } else if (amt <= 0) {
                System.out.println("Bet amount must be greater than zero.");
            } else {
                System.out.println("SPINNING...");

                symbol1 = symbols[random.nextInt(symbols.length)];
                System.out.print(symbol1 + " | ");
                symbol2 = symbols[random.nextInt(symbols.length)];
                System.out.print(symbol2 + " | ");
                symbol3 = symbols[random.nextInt(symbols.length)];
                System.out.print(symbol3);

                if (symbol1.equals(symbol2) && symbol2.equals(symbol3)) {
                    System.out.println("\nJACKPOT!");
                    jackpot+=amt;
                    System.out.printf("YOU WON $%.2f", jackpot);
                    currBal+=jackpot;
                    System.out.printf("\nYour current balance is : $%.2f", currBal);
                } else if (symbol1.equals(symbol2) || symbol1.equals(symbol3) || symbol2.equals(symbol3)) {
                    payout+=amt;
                    System.out.printf("\nYOU WON $%.2f", payout);
                    currBal+=payout;
                    System.out.printf("\nYour current balance is : $%.2f", currBal);
                }
                else {
                    System.out.printf("\nYOU LOST $%.2f", amt);
                    currBal -= amt;
                    System.out.printf("\nYour current balance is : $%.2f", currBal);
                }

                System.out.print("\nDo you want to play again (Y/N)? : ");
                playAgain = scanner.nextLine().toLowerCase();
            }

        } while (playAgain.equals("y"));
        System.out.print("\n******THANK YOU FOR PLAYING!******");

        scanner.close();
    }
}
