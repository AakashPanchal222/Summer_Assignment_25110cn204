import java.util.Random;
//We use the Random class when we want the computer to generate a number automatically instead of asking the user to enter it.
import java.util.Scanner;
//Number Guessing Game..

public class QUE101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        // random.nextInt(100)= gives no. form 0 to 99 , adding 1 gives range from 0 to 100.
        int guess;
        //this varaiable is sotoring our guess no.

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}

