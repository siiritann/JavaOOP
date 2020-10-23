import sun.security.util.math.intpoly.IntegerPolynomialP256;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

//        Example of input 1

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);


//      Example of input 2

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }


    }

}
