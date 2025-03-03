package Semaine3.td03;

public class UseCivility{
    public static void civility() {
        for (int i = 0; i < Civility.values().length; i++) {
            System.out.println(Civility.values()[i].name());
        }
    }

    // static Civility civilityCreator(int civ){

    // }

    public Civility CivilityCreator(int civ) {
        return Civility.values()[civ];
    }

    public Civility CivilityCreator(String name) {
        return Civility.valueOf(name.toUpperCase());
    }

    public static void main(String[] args) {

    }
}