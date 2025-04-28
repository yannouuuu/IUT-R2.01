package semaine7.td07;

public class Fish implements IAnimal {
    private static final String CRI = "Blob!";
    private static final int MEAL_SIZE = 1;
    private String name;

    public Fish(String name) {
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
        return "Fish (" + this.name + ")";
    }

}
