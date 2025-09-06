import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args){

        //The audio must be of type (.wav,.au,.aiff)


        String filePath="C:\\Users\\Jash Mistry\\Desktop\\A Caring Friend - Bad Snacks.wav";  //LOCATION OF YOUR FILE & FILE NAME WITH IT'S TYPE (.wav, .au , .aiff)

        File file = new File(filePath);


        try( Scanner scanner = new Scanner(System.in);AudioInputStream audioStream= AudioSystem.getAudioInputStream(file)){


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


           String response="";

           while(!response.equals("Q")){
               System.out.println("P = PLAY\nS = STOP\nR = RESET\nQ = QUIT");
               System.out.print("Enter your choice : ");

               response = scanner.next().toUpperCase();

               switch(response){
                   case "P" -> clip.start();
                   case "S" -> clip.stop();
                   case "R" -> clip.setMicrosecondPosition(0);
                   case "Q" -> clip.close();
                   default -> System.out.println("Invalid Choice");
               }

           }

        }
        catch(FileNotFoundException e){
            System.out.println("Could  not locate file");

        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio File not Supported!");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");

        }
        finally {
            System.out.println("BYE!");

        }
    }
}
