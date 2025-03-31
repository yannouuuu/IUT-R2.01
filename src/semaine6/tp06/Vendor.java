package semaine6.tp06;

import java.time.LocalDate;

public class Vendor extends Salesperson {
    private static final double PERCENTAGE = 0.20;
    private static final int BONUS = 400;

    public Vendor(String name, LocalDate hiringDate, double turnover){
        super(name, hiringDate, turnover);
    }

    public String getTitle() {
        return "Vendor";
    }

    public double getWages() {
        return this.getTurnover() * PERCENTAGE + BONUS;
    }
    
    @Override
    public boolean objectiveFulfilled() {
        return getTurnover() >= Salesperson.getObjective();
    }
}
