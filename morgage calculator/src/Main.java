import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = (annualInterest / 100) / 12;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numPayments = period * 12;

        double x = monthlyInterest * (Math.pow((1 + monthlyInterest), numPayments));
        double y = Math.pow((1 + monthlyInterest), numPayments) - 1;


        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        String result = mortgage.format(principle * (x / y));
        System.out.println("Mortgage: " + result);
    }
}