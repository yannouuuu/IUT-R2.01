package tpQU.tp03;

public class Student {
    public boolean thirdTimeCredit;
    private String name;
    private String forename;

    public Student(String name, String forename){
        this.name = name;
        this.forename = forename;
        thirdTimeCredit = false;
    }

    public Student(String name, String forename, boolean thirdTimeCredit){
        this.name = name;
        this.forename = forename;
        this.thirdTimeCredit = thirdTimeCredit;
    }

    // public int getDefaultDuration(){
        
    // }

    // public int getDuration(){

    // }

    public String toString(){
        return name + " " + forename;
    }
}
