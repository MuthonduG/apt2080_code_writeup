import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rate (example: 1 USD = 130.5 KES)
        double usdToKes = 130.5;
        double kesToUsd = 1 / usdToKes;

        System.out.println("Currency Converter: USD ⇄ KES");
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Convert from (USD/KES): ");
        String fromCurrency = scanner.next().toUpperCase();

        double convertedAmount;
        if (fromCurrency.equals("USD")) {
            convertedAmount = amount * usdToKes;
            System.out.printf("%.2f USD is %.2f KES\n", amount, convertedAmount);
        } else if (fromCurrency.equals("KES")) {
            convertedAmount = amount * kesToUsd;
            System.out.printf("%.2f KES is %.2f USD\n", amount, convertedAmount);
        } else {
            System.out.println("Invalid currency. Use USD or KES.");
        }

        scanner.close();
    }
}
