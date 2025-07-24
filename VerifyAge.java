import java.util.Scanner;

public class VerifyAge {
    public static void main(String[] args) {

        //To verify age using Method

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Enter you age : ");
        age = scanner.nextInt();

        if (ageCheck(age)) {
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are not an adult!");
        }
    }
        static boolean ageCheck(int age){

            return age>=18; //Substitute for if-else statements
        }
    }

