import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("----NUMBER GUESSING GAME----");


        int number=random.nextInt(0,101);
        int guess=0,guesses=0;

        while(guess!=number){

            System.out.print("\nGuess a number (0-100) : ");
            guess=scanner.nextInt();

            if(guess>number){
                System.out.println("Too High!");
            }
            else if(guess<number){
                System.out.println("Too Low!");
            }
            guesses+=1;

        }
        System.out.println("\nHURRAH!You got it!");
        System.out.printf("You took %d guesses",guesses);

        scanner.close();
    }
}
