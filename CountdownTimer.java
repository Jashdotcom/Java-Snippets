import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //COUNTDOWN TIMER PROGRAM 

       final int[] count = {0};//Used "final" coz it is used within the class.

        System.out.print("Where to start the countdown timer from? :  ");
        count[0]=scanner.nextInt();

        Timer timer = new Timer();
        TimerTask Task = new TimerTask(){

            @Override
            public void run(){
                if(count[0] ==0){
                    System.out.println("HAPPY NEW YEAR...✨");
                    timer.cancel();
                }
                else if(count[0] >0){
                    System.out.println(count[0]);
                    count[0] -=1;
                }
            }
        };
        timer.schedule(Task,0,1000);
    }
}
