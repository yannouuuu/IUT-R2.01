package semaine6.td06;

class SimpleParcel extends PostParcel, CourrierParcel {
    public Parcel() {
        super(1);
    }

    public double fare() {
        return 0.5 * this.getWeight();
    }
}