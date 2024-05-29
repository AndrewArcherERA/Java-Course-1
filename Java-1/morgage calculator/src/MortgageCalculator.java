public class MortgageCalculator {
    private int principle;
    private double annualInterest;
    private int period;

    public MortgageCalculator(int principle, double annualInterest, int period) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    public double calculateMortgage() {

        double monthlyInterest = getMonthlyInterest();
        int numPayments = getNumPayments();

        double x = monthlyInterest * (Math.pow((1 + monthlyInterest), numPayments));
        double y = Math.pow((1 + monthlyInterest), numPayments) - 1;
        return principle * (x / y);
    }


    public double calculateBalance(int paymentsMade){
        double monthlyInterest = getMonthlyInterest();
        int numPayments = getNumPayments();
        return principle
                *
                (Math.pow((1 + monthlyInterest), numPayments) - Math.pow((1 + monthlyInterest), paymentsMade))
                /
                (Math.pow((1 + monthlyInterest), numPayments) - 1);
    }

    private int getNumPayments() {
        return period * 12;
    }

    private double getMonthlyInterest() {
        return (annualInterest / 100) / 12;
    }

    public int getPeriod() {
        return period;
    }
}
