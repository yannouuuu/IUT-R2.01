package td06;

public class UseParcel { // Ce code contient des erreurs à démontrer dans la question Q3 de l'exercice 2
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel1();
        Parcel parcel2 = new PostParcel();
        PostParcel pp1 = new SimpleParcel();
        Parcel parcel3 = new FastParcel();
        Parcel parcel4 = new CourrierParcel();
        ArrayList<Parcel> shipment = new ArrayList<Parcel>();
        Truck camion = new Truck(shipment);

        double fare = 0;
        for (int i = 0; i < shipment.getShipmentSize(); i++) {
            PostParcel tmp = camion.getParcel(i);
            fare += tmp.fare();
        }
        System.out.println("Shipment fare: " + fare);
    }
}