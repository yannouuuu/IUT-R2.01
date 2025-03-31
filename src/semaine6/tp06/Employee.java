package semaine6.tp06;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate hiringDate;

    public Employee(String name, LocalDate hiringDate) {
        this.name = name;
        this.hiringDate = hiringDate;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + getTitle();
    }

    
    public abstract String getTitle();
    
    public abstract double getWages();
    
    // Pour la Q7
    public LocalDate getHiringDate() {
        return this.hiringDate;
    }

    public abstract boolean objectiveFulfilled();
}
