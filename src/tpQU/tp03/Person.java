package tpQU.tp03;

public class Person {
    String name;
    String forename;

    public Person(String name, String forename){
        this.name = name;
        this.forename = forename;
    }

    public String getName(){
        return name;
    }

    public String getForename(){
        return forename;
    }

    @Override
    public String toString(){
        return forename + " " + name;
    }
}