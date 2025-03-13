package tpQU.tp02;

/**
 * Represents a warrior card with attributes like name, strength and agility.
 * This class is used to create and manage warrior cards in a game context.
 * @author Yann Renard
 * @version 1.0
 */
public class WarriorCard {
    private String name;
    private int strength;
    private int agility;

    /**
     * Creates a new warrior card with specified attributes
     * @param name The name of the warrior
     * @param strength The strength value of the warrior
     * @param agility The agility value of the warrior
     */
    public WarriorCard(String name, int strength, int agility) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
    }

    /**
     * Compares this warrior card with another object for equality
     * @param obj The object to compare with
     * @return true if the objects are equal, false otherwise
     */
    
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
        WarriorCard other = (WarriorCard) obj;
        if (this.name.equals(other.name)) {
            return true;
        }
        if (this.strength == other.strength) {
            return true;
        }
        if (this.agility == other.agility) {
            return true;
        }
        return false;
    }

    /**
     * Compares the strength of this warrior with another warrior
     * @param other The warrior card to compare with
     * @return negative if this warrior is weaker, zero if equal, positive if stronger
     */
    public int compareStrength(WarriorCard other) {
        return Integer.compare(this.strength, other.strength);
    }

    /**
     * Compares the agility of this warrior with another warrior
     * @param other The warrior card to compare with
     * @return negative if this warrior is less agile, zero if equal, positive if more agile
     */
    public int compareAgility(WarriorCard other) {
        return Integer.compare(this.agility, other.agility);
    }

    /**
     * Returns a string representation of the warrior card
     * @return A string in the format "name[S=strength,A=agility]"
     */
    public String toString() {
        return name + "[S=" + strength + ",A=" + agility + "]";
    }
}