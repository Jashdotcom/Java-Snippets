import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight,newWeight;
        int choice;
        char kgs,lbs;

        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("\nEnter your choice : ");
        choice = scanner.nextInt();

        if(choice==1){
            System.out.print("\nEnter the weight (lbs) : ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf("%f lbs = %.2f kgs",weight,newWeight);
        }
        else if(choice==2) {

            System.out.print("\nEnter the weight (kg) : ");
            weight = scanner.nextDouble();

            newWeight = weight / 0.453592;

            System.out.printf("%f kgs = %.2f lbs", weight, newWeight);
        }
        else {
            System.out.println("\nInvalid Choice!");
        }

        scanner.close();
    }
}
