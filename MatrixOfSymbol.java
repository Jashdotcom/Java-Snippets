import  java.util.Scanner;

public class MatrixOfSymbol {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows,cols;
        String symbol,matrix;

        System.out.print("Enter number of rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns : ");
        cols = scanner.nextInt();

        System.out.print("Enter a symbol to print : ");
        symbol = scanner.next();

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){

                System.out.print(symbol);
            }
            System.out.println();
            scanner.close();
        }
    }
}
