public class Main {
    public static void main(String[] args) {
        int principle = (int) Console.readNumber("Principle ($1K - $1M): ", 1000, 1000000);
        double annualInterest = Console.readNumber("Annual Interest Rate: ", 0, 30);
        int period = (int) Console.readNumber("Period (Years): ", 1, 30 );

        var calculator = new MortgageCalculator(principle, annualInterest, period);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }

}