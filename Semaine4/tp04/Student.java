import java.util.Arrays;

public class Student {
    private Person pers;
    private double[] grades;

    public Student(String forename, String name, double[] grades) {
        this.pers = new Person(forename, name);
        this.grades = grades;
    }

    private Student(Person pers, double[] grades) {
        this.pers = pers;
        this.grades = grades;
    }

    public Student(String forename, String name, double grade) {
        this(forename, name, new double[]{grade}); // Chainage de constructeurs (on appelle le constructeur de la classe Student)
    }

    public String getForename() {
        return this.pers.getForename();
    }
    
    public String getName() {
        return this.pers.getName();
    }
    
    public double[] getGrades() {
        return grades;
    }
    
    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    
    public void setPers(Person pers) {
        this.pers = pers;
    }

    public String toString() {
        return "Student [" + this.pers.getId() + ": " + this.pers.getForename() + " " + this.pers.getName() + " = " + Arrays.toString(this.grades) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Student other = (Student) obj;
        if (!this.pers.equals(other.pers)) {
            return false;
        }
        if (!Arrays.equals(this.grades, other.grades))
            return false;
        return true;
    } 

    public double getAverage() {
        if (grades.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void addGrade(double aGrade) {
        grades = Arrays.copyOf(grades, grades.length + 1);
        grades[grades.length - 1] = aGrade;
    }
}