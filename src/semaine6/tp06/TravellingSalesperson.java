package semaine6.tp06;

public class TravellingSalesperson extends Salesperson {
    private static final double PERCENTAGE = 0.20;
    private static final int BONUS = 800;

    public TravellingSalesperson(String name, LocalDate hiringDate, double turnover) {
        super(name, hiringDate, turnover);
    }

    public String getTitle() {
        return this.getClass().toString();
    }

    public double getWages() {
        return this.getTurnover() * PERCENTAGE + BONUS;
    }

    
}
