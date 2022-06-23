import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double loanTerm = 12;
        double interestRate = 9.99;
        double payment = service.calculate(creditAmount, loanTerm, interestRate);
        int monthlyPayment = (int) payment;
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment + " рублей");

        CreditPaymentService service2 = new CreditPaymentService();
        loanTerm = 24;
        payment = service2.calculate(creditAmount, loanTerm, interestRate);
        monthlyPayment = (int) payment;
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment + " рублей");

        CreditPaymentService service3 = new CreditPaymentService();
        loanTerm = 36;
        payment = service3.calculate(creditAmount, loanTerm, interestRate);
        monthlyPayment = (int) payment;
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment + " рублей");
    }
}