package tpQU.tp03;

public class StudentBUT1 extends Student{
    private int DEFAULT_DURATION_BUT1 = 20;

    public StudentBUT1(String name, String forename){
        super(name, forename);
    }

    public StudentBUT1(String name, String forename, boolean thirdTimeCredit){
        super(name, forename, thirdTimeCredit);
    }

    public int getDefaultDuration(){
        return DEFAULT_DURATION_BUT1;
    }
}
