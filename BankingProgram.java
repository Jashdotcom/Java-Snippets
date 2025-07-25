import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double amt=0,deposit=0,withDraw=0,showBal=deposit;
        int choice=0;

        System.out.println("----BANKING PROGRAM----");

        while(choice!=4){

            System.out.println("\n1.Show Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit\n");
            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();

            if(choice==1){
                if(deposit == 0 )
                {
                    System.out.printf("\nYour balance : $%f",deposit);
                }
                else{
                    System.out.printf("Your balance : $%f\n",deposit);
                }
            }
            else if(choice==2){
                if(deposit==0){
                    System.out.print("\nEnter the amount to be deposited ($): ");
                    deposit = scanner.nextDouble();
                    System.out.printf("$%f deposited successfully!\n",deposit);
                }
                else{
                    System.out.print("\nEnter the amount to be deposited ($): ");
                    deposit = scanner.nextDouble();
                    System.out.printf("$%f deposited successfully!\n",deposit);
                    deposit+=deposit;
                }

            }
            else if(choice==3){
                if(deposit == 0){
                    System.out.println("\nCannot withdraw!Zero balance");
                }
                else{
                    System.out.print("\nEnter the amount to withdraw ($): ");
                    withDraw=scanner.nextDouble();
                    if(deposit<withDraw){
                        System.out.println("\nYou are trying to withdraw more amount than what is there in your account!");
                    }
                    else{
                        System.out.printf("\n$%f withdrawn successfully!\n",withDraw);
                        deposit = deposit - withDraw;
                        System.out.printf("Balance after withdrawing $%f : \n",deposit);
                    }
                }
            }
            else if(choice==4){
                System.out.println("\nExited Successfully!");
            }
            else{
                System.out.println("\nInvalid Choice!Choose again");
            }
        }
        scanner.close();

    }
}
