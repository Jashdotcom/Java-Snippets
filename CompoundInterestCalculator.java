import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal,rate,amt;
        int time,years;

        System.out.print("Enter the principal amount ($) : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate (%) : ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the times compunded per year : ");
        time = scanner.nextInt();

        System.out.print("Enter the number of years : ");
        years = scanner.nextInt();

        amt = principal * Math.pow(1 + rate/time , time * years);

        System.out.printf("\n$%f after %d year/s = $%f",principal,years,amt);

        scanner.close();

    }
}
