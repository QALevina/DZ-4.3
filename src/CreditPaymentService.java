public class CreditPaymentService {

    public double calculate(double s, double n, double i) {

        double p = i / 100 / 12;
        double p2 = 1 + p;

        double index = s * (p + (p / (Math.pow(p2, n) - 1)));

        return index;

    }
}

