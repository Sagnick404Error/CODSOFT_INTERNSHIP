
import java.util.*;

public class randomNumberGame {
    randomNumberGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 8;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println(
                    "You Have " + maxAttempts + " chance to guess the number between " + minRange + " to " + maxRange);
            int count = 0;
            boolean guess = false;

            while (maxAttempts > count) {
                System.out.println("Enter your number");
                int userInput = sc.nextInt();
                count++;

                if (userInput == randomNumber) {
                    System.out.println("Congratulations!! You Win the Game...");
                    score++;
                    guess = true;
                    break;
                } else if (userInput > randomNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }

            }
            if (!guess) {
                System.out.println("You did not guess the correct Number It was : " + randomNumber);
            }
            System.out.println("Do you want to play again (YES/NO)");
            sc.nextLine();
            String feedback = sc.nextLine().toLowerCase();
            if (feedback.equals("yes")) {
                playAgain = true;
                System.out.println("Your corrent Score is " + score);
            } else {
                System.out.println("Your final score is " + score);
                break;
            }
            sc.close();
        }

    }

    public static void main(String[] args) {
        new randomNumberGame();
    }
}
