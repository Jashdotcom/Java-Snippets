import java.util.Scanner;

public class TempConversionUsingTernary {

    public static void main(String[] args){

        //To print degree symbol : "numlock should be on -> Alt + 0176"

        Scanner scanner = new Scanner(System.in);

        double temp,newTemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print("Convert to (C/F) : ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ?  (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("%.2f°%s",newTemp,unit);

        scanner.close();
    }
}
