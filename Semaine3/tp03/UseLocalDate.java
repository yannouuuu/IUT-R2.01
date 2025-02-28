package Semaine3.tp03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class UseLocalDate {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1990, 5, 15);

        System.out.println("Date d1 (aujourd'hui) : " + d1);
        System.out.println("Date d2 (anniversaire) : " + d2);

        Random random = new Random();
        int year = 1993 + random.nextInt(30); // jour random entre 1993 et 2023
        int month = 1 + random.nextInt(12); 
        int day = 1 + random.nextInt(28);
        LocalDate d3 = LocalDate.of(year, month, day);
        System.out.println("Date random d3 : " + d3);
       
        LocalDate oldestDate;
        if (d2.isBefore(d3)) {
            oldestDate = d2;
        } else {
            oldestDate = d3;
        }

        System.out.println("La plus vieille date entre d2 et d3 : " + oldestDate);

        LocalDate d1Plus7 = d1.plusDays(7);
        System.out.println("Le 7eme jour après aujourd'hui : " + d1Plus7);

        long yearsBetween = ChronoUnit.YEARS.between(d1, d2);
        System.out.println("Année entre d2 et d1 " + yearsBetween);
    }
}