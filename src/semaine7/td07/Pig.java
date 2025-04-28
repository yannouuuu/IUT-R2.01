package semaine7.td07;

public class Pig implements IAnimal {
    private static final String CRI = "Grouik!";
    private static final int MEAL_SIZE = 1;
    private String name;

    public Pig(String name) {
        this.name = name;
    }

    @Override
    public boolean isPet() {
        return true;
    }

    @Override
    public void shout() {
        System.out.println(CRI);
    }

    @Override
    public int foodAmount() {
        return MEAL_SIZE;
    }
    
    public String toString() {
        return "Pig (" + this.name + ")";
    }

    public void rollingInMud() {
        System.out.println("roll in the mud");
    }

    
}