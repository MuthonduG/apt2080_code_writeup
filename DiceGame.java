import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random dice = new Random();
        int score = 3;  // Start with a score of 3

        System.out.println("🎲 Welcome to the Dice Game!");
        System.out.println("Rules: Even roll ➡️ +1, Odd roll ➡️ -1.");
        System.out.println("Win at 6️⃣ points, Lose at 0️⃣ points.");
        System.out.println("--------------------------------------");

        while (score > 0 && score < 6) {
            System.out.print("\nPress ENTER to roll the dice...");
            scanner.nextLine();  // Wait for user input

            int roll = dice.nextInt(6) + 1;  // Random number between 1 and 6
            System.out.println("🎲 You rolled: " + roll);

            if (roll % 2 == 0) {
                score++;
                System.out.println("✅ Even number! +1 point.");
            } else {
                score--;
                System.out.println("❌ Odd number! -1 point.");
            }

            System.out.println("🔢 Your score: " + score);
        }

        if (score == 6) {
            System.out.println("\n🎉 Congratulations! You won! 🏆");
        } else {
            System.out.println("\n💀 Game Over! You lost. ❌");
        }

        scanner.close();
    }
}
