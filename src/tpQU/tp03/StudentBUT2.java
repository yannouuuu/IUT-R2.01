package tpQU.tp03;

public class StudentBUT2 extends Student{
    private int DEFAULT_DURATION_BUT2 = 30;

    public StudentBUT2(String name, String forename){
        super(name, forename);
    }

    public StudentBUT2(String name, String forename, boolean thirdTimeCredit){
        super(name, forename, thirdTimeCredit);
    }

    public int getDefaultDuration(){
        return DEFAULT_DURATION_BUT2;
    }
}
