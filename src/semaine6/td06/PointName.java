package semaine6.td06;

class PointName extends Point {
    private char nom;
    private int x,y;

    public PointName(char nom, int x, int y) {
        this.nom = nom;
        super(x, y);
    }

    @Override
    public String toString() {
        return this.nom + super.toString();
    }

    /* Question 2 : Dotez la classe PointName d'une méthode de classe similar() et d'une méthode d'instance similarTo, prenant toutes deux des paramètres de type PointName, et fournissant toutes les deux la valeur true lorsque les deux points concernés ont à la fois les mêmes coordonnées et le même nom. */
    public static boolean similar(PointName p1, PointName p2) {
        return p1.x == p2.x && p1.y == p2.y && p1.nom == p2.nom;
    }

    public boolean similarTo(PointName p) {
        return similar(this, p);
    }

    /* Question 3 : En supposant l'initialisation suivante exécutée, à quel résultat mène l'exécution des instructions suivantes ? Pourquoi ?
    Point p = new Point(2, 4);
    PointName pn1 = new PointName('A', 2, 4);
    PointName pn2 = new PointName('B', 2, 4);
    */

    
}