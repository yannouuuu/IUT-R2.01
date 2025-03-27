class FastParcel extends PostParcel {
    public FastParcel() {
        super(1);
    }

    public double fare() {
        return 0.5 * this.getWeight();
    }
}