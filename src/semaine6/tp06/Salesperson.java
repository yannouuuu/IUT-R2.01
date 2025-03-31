package semaine6.tp06;

import java.time.LocalDate;

public abstract class Salesperson extends Employee {
    private double turnover;
    private static double objective = 10000.0;

    public Salesperson(String name, LocalDate hiringDate, double turnover) {
        super(name, hiringDate);
        this.turnover = turnover;
    }

    public double getTurnover() {
        return this.turnover;
    }
    
    public static double getObjective() {
        return objective;
    }

    public String toString() {
        return super.toString() + " " + this.getTurnover();
    }
}
