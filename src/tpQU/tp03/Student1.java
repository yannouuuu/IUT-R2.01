package tpQU.tp03;

public class Student1 extends Person{
    private final static int DEFAULT_DURATION_STUDENT1 = 20;
    public boolean thirdTimeCredit;

    public Student1(String name, String forename){
        super(name, forename);
        thirdTimeCredit = false;
    }

    public Student1(String name, String forename, boolean thirdTimeCredit){
        super(name, forename);
        this.thirdTimeCredit = thirdTimeCredit;
    }

    public int getDefaultDuration(){
        return DEFAULT_DURATION_STUDENT1;
    }

    public int getDuration(){
        if(thirdTimeCredit == true){
            return (int) (DEFAULT_DURATION_STUDENT1* 1.3);
        }
        else{
            return DEFAULT_DURATION_STUDENT1;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " (" + getDuration() + ")";
    }
}
