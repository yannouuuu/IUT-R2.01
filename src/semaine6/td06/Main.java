public class Main {
    public static void main(String [] args) {
        Point p = new Point(1, 2);
        PointName p1 = new PointName('A', 2, 4);
        PointName p2 = new PointName('B', 2, 4);

        // Q1.1 Entre deux instances de PointName
        System.out.println(pn1 + " (PN) is similar to (PN)" + pn2 + ": " + p1.similarTo(pn2));
        // Q1.2 Entre une instance de Point et une instance de PointName
        System.out.println(p + " (P) is similar to (PN)" + pn1 + ": " + p1.similarTo(pn1));
        // Q1.3 Entre une instance de PointName et une instance de Point
        System.out.println(pn1 + " (PN) is similar to (P)" + p + ": " + p.similarTo(p));
        // Q1.4 Entre deux instances de PointName avec la méthode de classe
        System.out.println(pn1 + " (PN) and (PN)" + pn2 + " similar = " + p.similarTo(pn1, p2));
    }
}