package semaine8.td08;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String name;
    private final LocalDate birth;
    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }
    public String getName() {return this.name;}
    public LocalDate getBirth() {return this.birth;}
    public long getAge() {return this.birth.until(LocalDate.now(), ChronoUnit.YEARS);}
    @Override
    public String toString() {
        return this.name + " (" + this.getName() + " " + this.getAge() + ")";
    }
}