package tpQU.tp03;


public class Student2 extends Student1{    
    private static final int DEFAULT_DURATION_STUDENT2 = 30;
    
    public Student2(String name, String forename){
        super(name, forename);
    }

    public Student2(String name, String forename, boolean thirdTimeCredit){
        super(name, forename, thirdTimeCredit);
    }

    public int getDefaultDuration(){
        return DEFAULT_DURATION_STUDENT2;
    }

    public int getDuration(){
        if(thirdTimeCredit == true){
            return (int) (DEFAULT_DURATION_STUDENT2* 1.3);
        }
        else{
            return 30;
        }
    }


}
