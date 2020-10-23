import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.lang.Math;


public class NumberGame {

    public static void main(String [] args) {

        int randomNo = (int) (Math.random() * 100 + 1);    // generate random number
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        System.out.println(randomNo);

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again.");
            int guess = scanner.nextInt();

            if (guess > randomNo) {
                System.out.println("It's smaller than " + guess + ".");
            }
            else if (guess < randomNo) {
                System.out.println("It's bigger than " + guess + ".");
            }
            else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("CORRECT. YOU WON!");
        }
        else {
            System.out.println("Game over. YOU LOSE.");
            System.out.println("The number was: " + randomNo);
        }
    }
}

///        Example of input 1
//
//        System.out.println("Enter your address: ");
//        String address = scanner.nextLine();
//        System.out.println("You live at: " + address);
//
//
////      Example of input 2
//
//        System.out.println("Enter your grade: ");
//        Scanner scanner = new Scanner(System.in);
//        int grade = scanner.nextInt();
//        if(grade > 90){
//        System.out.println("Wow! you did well!");
//        }else{
//        System.out.println("Not bad, but you can do better next time!");
//        }

