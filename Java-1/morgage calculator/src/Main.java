import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principle = (int) readNumber("Principle ($1K - $1M): ", 1000, 1000000);
        double annualInterest = readNumber("Annual Interest Rate: ", 0, 30);
        int period = (int) readNumber("Period (Years): ", 1, 30 );

        double calculatedMortgage = calculateMortgage(principle, annualInterest, period);

        String mortgage = NumberFormat.getCurrencyInstance().format(calculatedMortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgage);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        printPaymentSchedule(principle, annualInterest, period);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value >= min && value <= max) break;
            else System.out.println("Enter a number between " + min +" and "+ max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principle,
            double annualInterest,
            int period) {

        double monthlyInterest = (annualInterest / 100) / 12;
        int numPayments = period * 12;

        double x = monthlyInterest * (Math.pow((1 + monthlyInterest), numPayments));
        double y = Math.pow((1 + monthlyInterest), numPayments) - 1;
        return principle * (x / y);
    }

    public static void printPaymentSchedule(int principle, double annualInterest, int period){
        double monthlyInterest = (annualInterest / 100) / 12;
        int numPayments = period * 12;
        int paymentsMade = 0;
        double amountLeft;
        while(numPayments != paymentsMade){
            amountLeft = principle * (Math.pow((1 + monthlyInterest), numPayments) - Math.pow((1 + monthlyInterest), paymentsMade)) / (Math.pow((1 + monthlyInterest), numPayments) - 1);
            String formatedAmountLeft = NumberFormat.getCurrencyInstance().format(amountLeft);
            System.out.println(formatedAmountLeft);
            paymentsMade++;
        }
    }
}