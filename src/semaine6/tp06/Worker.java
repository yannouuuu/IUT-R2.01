package semaine6.tp06;

import java.time.LocalDate;

public class Worker extends Employee {
    private static final double BY_UNIT = 5.00;
    private int units;
    private static int objective = 1000;

    public Worker(String name, LocalDate hiringDate, int units) {
        super(name, hiringDate);
        this.units = units;
    }

    public String getTitle() {
        return "Worker";
    }
    
    public double getWages() {
        return BY_UNIT * this.units;
    }
    
    public int getUnits() {
        return this.units;
    }

    public String toString() {
        return super.toString() + " " + this.getUnits();
    }
    
    @Override
    public boolean objectiveFulfilled() {
        return units >= objective;
    }
}
