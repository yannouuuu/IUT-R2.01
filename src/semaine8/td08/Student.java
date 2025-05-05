package semaine8.td08;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student implements Iterable<Double> {
    private static int compteur = 0;
    private String INE;
    private Person person;
    private Map<Mat, Double> grades;
    private static boolean displayAdmin = true;

    public Student(String name, LocalDate birth) {
        this(name, birth, new HashMap<Mat, Double>());
    }

    public Student(String name, LocalDate birth, HashMap<Mat, Double> grades) {
        this.person = new Person(name, birth);
        this.INE = String.valueOf(compteur);
        compteur++;
        this.grades = grades;
    }

    public void addGrade(Mat mat, double grade) {
        this.grades.put(mat, grade);
    }

    public void addGrade(String mat, double grade) {
        this.addGrade(Mat.valueOf(mat.toUpperCase()), grade);
    }

    public double computeOverallGrade() {
        double total = 0;
        for (Double grade: grades.values()) {
            total += grade;
        }
        if (grades.values().isEmpty()) {
            return -1;
        }
        return total / grades.values().size();
    }

    public static void setPedagogique() {
        Student.displayAdmin = false;
    }

    public static void setAdmin() {
        Student.displayAdmin = true;
    }

    @Override
    public String toString() {
        if (Student.displayAdmin) {
            return this.person.toString();
        } else {
            return this.grades.toString();
        }
    }

    public static void main(String[] args) {
        Student paul = new Student("Paul", LocalDate.of(1990, 1, 1));
        Student.setAdmin();
        System.out.println(paul.toString());
        System.out.println(paul.toString());
        Student.setPedagogique();
        System.out.println(paul.toString());
        paul.addGrade(Mat.BDD, 10);
        paul.addGrade(Mat.SYS, 10);
        paul.addGrade(Mat.EN, 15);

        for (Double grade: paul) {
            System.out.println(grade);
        }
    }

    @Override
    public Iterator<Double> iterator() {
        return grades.values().iterator();
    }
}