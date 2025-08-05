import java.util.Scanner;

public class LargestPosInteger {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int size;
        int[] num;

        System.out.print("Enter the size of array : ");
        size = scanner.nextInt();
        System.out.println();

        num = new int[size];

        for(int i=0;i<size;i++){
            System.out.printf("Enter the element at index %d : ",i);
            num[i] = scanner.nextInt();

            while(num[i]==0){
                System.out.println("'0' cannot be an element.Enter again!");
                System.out.printf("Enter the element at index %d : ",i);
                num[i] = scanner.nextInt();
            }
        }

        System.out.print("\nYour array is : ");

        for (int i : num) {
            System.out.print(i + " ");
        }

        int max = -1;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] == -num[j]) {
                    int absValue = Math.abs(num[i]);
                    if (absValue > max) {
                        max = absValue;
                    }
                }
            }
        }

        if (max > 0) {
            System.out.print("\nLargest positive integer with its negative present : " + max);
        } else {
            System.out.print("\n No such positive-negative pair found.");
        }

        scanner.close();

    }

}

