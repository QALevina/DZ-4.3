public class CreditPaymentService {

    public double calculate(double creditAmount, double loanTerm, double interestRate) {
        double monthlyInterestRate = interestRate / 100 / 12;
        double exponentiationMonthlyInterestRate = 1 + monthlyInterestRate;
        double index = creditAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow(exponentiationMonthlyInterestRate, loanTerm) - 1)));
        return index;

    }
}

