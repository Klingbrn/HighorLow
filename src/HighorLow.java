import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = 0;
        int guess = 0;
        boolean done = false;
        String trash = "";

        randomNumber = rand.nextInt(10) + 1;
        do {
            System.out.println("Please Guess a number between 1 - 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input. You've entered: " + trash);
                System.out.println("please re-enter your input. ");
                }
        } while (!done);
        System.out.printf("The random number was: %d\n", randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your number was too high.");
        } else {
            System.out.println("on the money! Your guess was correct.");
        }
    }
}