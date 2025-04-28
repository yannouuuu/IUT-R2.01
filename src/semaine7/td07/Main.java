package semaine7.td07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IAnimal> animals = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i++) {
            animals.add(new Fish("Fish" + i));
        }

        Fish fish = new Fish("Fish");
        Pig pig = new Pig("Pig");
        Tiger tiger = new Tiger("Tiger");

        animals.add(fish);  
        animals.add(pig);
        animals.add(tiger);

        for (IAnimal animal : animals) {
            animal.shout();
        }

        for (IAnimal animal : animals) {
            System.out.println(
                animal.getClass().getSimpleName() + "\t"+ animal.foodAmount()
            );
        }

        System.out.println("=====================================================");

        for (IAnimal animal : animals) {
            // if(animal.getClass().getSimpleName().equals("Pig"))
            if (animal instanceof Pig) {
                animal.shout();
                
            }
        }
        
        System.out.println("=====================================================");

        for (IAnimal animal : animals)
            if (animal instanceof Pig)
                ((Pig) animal).rollingInMud();
    }
}
