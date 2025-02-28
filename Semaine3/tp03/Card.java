package Semaine3.tp03;

public class Card {

    private Color color;
    private Rank rank;

    public Card(Color color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public Card(String color, String rank) {
        this.color = Color.valueOf(color.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public Color getColor() {
        return color;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (color != other.color)
            return false;
        if (rank != other.rank)
            return false;
        return true;
    }

    public String toString() {
        return " Rank : " + rank + " Couleur : " + color;
    }


}
