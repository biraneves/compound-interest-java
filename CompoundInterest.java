public class CompoundInterest {

    public static void main(String[] args) {

        Investment inv = new Investment(1000.0, 0.05, 10);

        System.out.printf("Principal: $%,20.2f%n", inv.getPrincipal());
        System.out.printf("Rate: %.2f%n", inv.getRate());
        System.out.printf("Periods: %4d%n", inv.getPeriods());
        System.out.printf("Amount: %,20.2f%n%n", inv.getAmount());

        inv.amountOverPeriods();

    }

}
