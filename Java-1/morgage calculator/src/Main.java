import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principle;
        double annualInterest;
        int period;
        while(true){
            System.out.print("Principle ($1K - $1M): ");
            principle = scanner.nextInt();
            if(principle >= 1000 && principle <= 1000000) break;
            else System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextDouble();
            if(annualInterest > 0 && annualInterest <= 30) break;
            else System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        while(true){
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if(period >= 1 && period <= 30) break;
            else System.out.println("Enter a period between 1 and 30.");
        }

        double monthlyInterest = (annualInterest / 100) / 12;
        int numPayments = period * 12;

        double x = monthlyInterest * (Math.pow((1 + monthlyInterest), numPayments));
        double y = Math.pow((1 + monthlyInterest), numPayments) - 1;


        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        String result = mortgage.format(principle * (x / y));
        System.out.println("Mortgage: " + result);
    }
}