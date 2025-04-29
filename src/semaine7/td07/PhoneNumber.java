package semaine7.td07;

public class PhoneNumber {
    private int countryCode;
    private int areaCode;
    private int secteurCode;
    private int one;
    private int two;
    private int three;

    public PhoneNumber(int countryCode, int areaCode, int secteurCode, int one, int two, int three){
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.secteurCode = secteurCode;
        this.one = one;
        this.two = two;
        this.three = three;
    }

    @Override
    public String toString() {
        // Retourne le numéro sous la forme XX.XX.XX
        return String.format("%02d.%02d.%02d", one, two, three);
    }

    // public String standardFormat() {

    // } 
    
    // public String internationalFormat() {

    // }
}
