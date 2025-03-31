package semaine6.tp06;

public class Vendor extends Salesperson {
    private static final double PERCENTAGE = 0.20;
    private static final int BONUS = 400;

    public Vendor(String name, LocalDate hiringDate, double turnover){
        super(name, hiringDate, turnover);
    }

    public String getTitle() {
        return this.getClass().toString();
    }

    public double getWages() {
        return this.getTurnover() * PERCENTAGE + BONUS;
    }
}
