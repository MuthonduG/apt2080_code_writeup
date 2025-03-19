import java.util.Random;

public class IfStatements {

    Random dice = new Random();
    Random days = new Random();

    public void diceRoll() {
        int roll1 = dice.nextInt(6) + 1; 
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;

        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        System.out.println("Total score: " + total);

        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }

    public void discountDetermination() {
        int daysUntilExpiration = days.nextInt(12);
        int discountPercentage = 0;

        System.out.println("Days until expiration: " + daysUntilExpiration);

        if (daysUntilExpiration < 1) { 
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) { 
            discountPercentage = 20;
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 5) { 
            discountPercentage = 10;
            System.out.println("Your subscription expires in " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }

    public static void main(String[] args) {
        IfStatements game = new IfStatements();
        game.diceRoll();
        game.discountDetermination();
    }
}
