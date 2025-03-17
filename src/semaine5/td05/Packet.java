package semaine5.td05;

public class Packet extends Mail {
    private static final double MAX_WEIGHT = 5000.0;
    private double weight;

    public Packet(boolean express, String address, double weight) {
        super(express, address);
        this.weight = weight;
    }

    @Override
    public double frank() {
        double price;
        if (!this.isValid()) return 0.0;
        price = super.frank();
        if (this.express) price *= 2;
        price += Math.floor(this.weight / 100.0) * 0.5;
        return price;
    }

    @Override
    public boolean isValid() {
        return super.isValid() && (weight > 0) && (weight <= MAX_WEIGHT);
    }

    public String toString() {
        String result;
        if (! this.isValid()) {
            result = "Packet (invalid)\n";
        } else if (this.express) {
            result = "Packet (Express)\n";
        } else {
            result = "Packet\n";
        }
        result += "Destination : " + this.address + "\n";
        result += "Price : " + this.frank() + "euros\n";
        result += "Weight : " + this.weight + "g\n";
        return result;
    }
}
