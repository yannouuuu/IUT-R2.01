class CourrierParcel {
    private double volume;

    public CourrierParcel(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double fare() {
        return 0.5 * this.volume;
    }
}