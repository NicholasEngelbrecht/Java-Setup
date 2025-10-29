import java.util.InputMismatchException;
import java.util.Scanner;

public class Monday27 {
    public static void main() {
        numberGame();
    }

    // Number guessing game
    public static void numberGame() {
        int SECRETNUMBER = 42;
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        boolean errored = false;

        while (true) {
            if (!errored)
                if (first) System.out.print("Guess the secret number: ");
                else System.out.print("Wrong number.  Please guess again: ");
            String text = scanner.next();

            try {
                first = false;
                errored = false;

                int guess = Integer.parseInt(text);
                if (guess == SECRETNUMBER) {
                    System.out.println("You got it!  The secret number was 42!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Please guess a real number: ");
                errored = true;
            }
        }
    }
}
