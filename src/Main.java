import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static int calculate(double rental, double price) {

        double result = ((rental * 12) / price) * 100;

        return (int) result;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("$$$$RENTAL YIELD CALCULATOR$$$$");

        System.out.print("Enter monthly income (IDR): ");
        double rental = scanner.nextDouble();

        System.out.print("Enter property price (IDR): ");
        double price = scanner.nextDouble();

        int result = calculate(rental, price);

        System.out.println("Your Rental Annual Yield: " + result + "%");

    }
}