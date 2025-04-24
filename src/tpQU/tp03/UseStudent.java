package tpQU.tp03;

public class UseStudent {
    public static void main(String[] args){
        Person  person = new Person("Alice", "a");
        Student1 student1 = new Student1("Bruno", "b");
        Student2 student2 = new Student2("Clément", "c");
        
        System.out.println(person);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
