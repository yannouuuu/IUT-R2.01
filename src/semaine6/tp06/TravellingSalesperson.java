package semaine6.tp06;

import java.time.LocalDate;

public class TravellingSalesperson extends Salesperson {
    private static final double PERCENTAGE = 0.20;
    private static final int BONUS = 800;

    public TravellingSalesperson(String name, LocalDate hiringDate, double turnover) {
        super(name, hiringDate, turnover);
    }

    public String getTitle() {
        return "TravellingSalesperson";
    }

    public double getWages() {
        return this.getTurnover() * PERCENTAGE + BONUS;
    }

    @Override
    public boolean objectiveFulfilled() {
        return getTurnover() >= Salesperson.getObjective();
    }
}
