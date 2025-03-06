public class Person {
    private final int ID;
    private static int nb;
    private String forename;
    private String name;

    public Person(String forename, String name) {
        this.ID = nb; 
        nb++;
        this.forename = forename;
        this.name = name;
    }

    public int getID() {
        return ID;
    }
    
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.ID + ": " + this.forename + " " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } 
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true; 
    }
}
