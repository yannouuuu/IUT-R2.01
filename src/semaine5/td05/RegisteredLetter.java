package semaine5.td05;

public class RegisteredLetter extends Mail {
    private String format;

    public RegisteredLetter(boolean express, String address, String format) {
        super(express, address); // super c'est comme this mais ça fait appel à la class au dessus (la class mère)
        this.format = format;
    }

    @Override // pour dire que c'est une méthode redéfinie
    public double frank(){
        if (! this.isValid()) return 0.0 ;
        double price;
        if ("A4".equals(this.format)) price = 2.0 + Mail.BASIS;
        else price = 3.0 + Mail.BASIS;
        if (this.express) price *= 2;
        return price;
    }

    public String toString(){
        // String result;
        // if (this.express)
        //     result = "Mail (Express)\n";
        // else
        //     result = "Mail\n";
        // result += "         Destination : " + this.address + "\n";
        // result += "         Price : " + this.frank() + "\n";
        // result += "         Format : " + this.format + "\n";
        // return result;

        String result; 
        result = super.toString();
        result += "         Destination : " + this.address + "\n";
        result += "         Price : " + this.frank() + "\n";
        result += "         Format : " + this.format + "\n";

    }
}
