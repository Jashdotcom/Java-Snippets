import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //QUIZ GAME

        /*STEPS TO CREATE GAME :
                  1.Create array of questions
                  2.Create array of options
                  3.Array of answers
                  4.Declare Variables
                  5.Welcome Message
                  6.Listing Each question using loop
                         a.List our options in loop
                         b.Take a guess from user
                         c.Check the guess of user (right or wrong)
                  7.Display final score*/


        String[] questions = {"\nQ1.What is the main function of a router?",
                              "\nQ2.Which part of the computer is considered the brain?",
                              "\nQ3.What year was facebook launched? ",
                              "\nQ4.Who is known as the father of computers?",
                              "\nQ5.What was the first programming language?"};

        String[][] options = {{"1.Storing files","2.Encrypting data","3.Directing internet traffic","4.Managing passwords"},
                              {"1.CPU","2.Hard Drive","3.RAM","4.GPU"},
                              {"1.2000","2.2004","3.2006","4.2008"},
                              {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                              {"1.COBOl","2.C","3.Fortran","4.Assembly"}};

        int[] answers = {3,1,2,4,3};

        int score=0,guess,count=0;

        System.out.println("****WELCOME TO THE QUIZ GAME****");

        for(int i=0;i<questions.length;i++){

            System.out.println(questions[i]);

            for(String option : options[i]){

                System.out.println(option);
            }
            System.out.print("\nEnter your answer(1-4) : ");
            guess = scanner.nextInt();

            if(guess==answers[i]){
                System.out.println("CORRECT!");
                count++;
            }
            else{
                System.out.println("WRONG!");
            }
        }
        System.out.printf("\nYou scored %d out of 5!",count);

        scanner.close();
    }
}
