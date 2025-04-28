package semaine7.td07;

public class Tiger implements IAnimal {
    private static final String CRI = "Purr";
    private static final int MEAL_SIZE = 1;
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public boolean isPet() {
        return false;
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
        return "Tiger (" + this.name + ")";
    }

}
