import java.util.Scanner;

public class CalculateCurrencyNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to be withdrawn (in hundreds): ");
        int amountInHundreds = scanner.nextInt();

        int hundreds = amountInHundreds;
        int fifties = 0;
        int tens = 0;

        while (hundreds >= 10) {
            if (hundreds >= 100) {
                hundreds -= 100;
            } else if (hundreds >= 50) {
                fifties++;
                hundreds -= 50;
            } else if (hundreds >= 10) {
                tens++;
                hundreds -= 10;
            }
        }

        System.out.println("Currency Notes:");
        System.out.println("Hundreds: " + amountInHundreds);
        System.out.println("Fifties: " + fifties);
        System.out.println("Tens: " + tens);
    }
}
