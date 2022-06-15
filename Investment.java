public class Investment {

    private double amount; // Amount by the end of each period
    private double principal; // Initial investment
    private double rate; // The interest rate per period
    private int periods; // The number of periods

    public Investment (double principal, double rate, int periods) {

        if (principal > 0) this.principal = principal;
        if (rate > 0) this.rate = rate;
        if (periods >= 1) this.periods = periods;
        this.amount = this.principal * Math.pow(1.0 + this.rate, periods);

    }

    public double getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(double principal) {
        if (principal > 0) this.principal = principal;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        if (rate > 0) this.rate = rate;
    }

    public int getPeriods() {
        return this.periods;
    }

    public void setPeriods(int periods) {
        if (periods > 0) this.periods = periods;
    }

    public double getAmount() {
        return this.amount;
    }

    public void amountOverPeriods() {
        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= this.periods; year++) {
            double amnt = this.principal * Math.pow(1.0 + this.rate, year);
            System.out.printf("%4d%,20.2f%n", year, amnt);
        }
    }

}
