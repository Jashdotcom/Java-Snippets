import java.util.Scanner;

public class HNYusingThread{

    public static void main(String[] args) throws InterruptedException{

        //To print "Happy New Year" using Thread

        int start = 10;

        for(int i = start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");

    }
}
