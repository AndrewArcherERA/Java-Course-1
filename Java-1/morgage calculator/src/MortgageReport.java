import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currancy;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currancy = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        int numPayments = calculator.getPeriod() * 12;
        int paymentsMade = 0;
        while (numPayments >= paymentsMade) {
            double amountLeft = calculator.calculateBalance(paymentsMade);
            String formatedAmountLeft = currancy.format(amountLeft);
            System.out.println(formatedAmountLeft);
            paymentsMade++;
        }
    }

    public void printMortgage() {
        String mortgage = currancy.format(calculator.calculateMortgage());
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgage);
    }
}
