package semaine3.td03;

public class RBGColor{
    private static final int MAX_VALUE = 255;
    private String name;
    private int red;
    private int green;
    private int blue;

    // Fonction utilitaire pas demandé dans le sujet (pour gagner du temps)
    private boolean isOk(int value) {
        return (value >= 0 && value <= MAX_VALUE);
    }
    
    // Accesseur (getter)
    public String getName() {
        return this.name;
    }

    // Mutateur (setter)
    public void setName(String name) {
        this.name = name;
    }

    // On peut vérifier la nouvelle valeur dans le mutateur
    public void setRed(int red) {
        if(isOk(red)) {
            this.red = red;
        }
    }

    public RBGColor(String name, int red, int green, int blue) {
        if(isOk(red) && isOk(green) && isOk(blue)) {
        // if((red >= 0 && red <= MAX_VALUE) 
        //     && (green >= 0 && green <= MAX_VALUE) 
        //     && (blue >= 0 && blue <= MAX_VALUE)) {
            this.name = name;
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    /*  Question 3  */
    public String toString() {
        return "(" + this.name + ":R" + this.red + "G:" + this.green + "B:" + this.blue + ")";
    }

    /*  Question 4  */
    private static int normalize(int value) {
        if (value < 0) {
            return 0;
        } else if (value > MAX_VALUE) {
            return MAX_VALUE;
        } else {
            return value;
        }
    }


    // RBGColor deepen(int k) {
    //     // pour creer un nouvel objet on appelle le constructeur
    //     return new RBGColor(this.name + "*" k, 
    //                         normalize(this.red * k), 
    //                         normalize(this.green * k), 
    //                         normalize(this.blue * k)
    //     );
    // }
    
    /*  Question 5  */
    // Modifier cette méthode afin d'en faire une méthode de classe et non une méthode d'instance
    public static RBGColor deepen(RBGColor from, RBGColor k) {
        return new RBGColor(from.name + "*" + k.name, 
                            normalize(from.red * k.red), 
                            normalize(from.green * k.green), 
                            normalize(from.blue * k.blue)
        );
    }

    /*  Question 6  */ 
    public RBGColor blend(RBGColor from) {
        return new RBGColor(null, this.red + from.red, this.green + from.green, this.blue + from.blue);
    }

    // 2 pas de sens : static RBGColor blend(RBGColor c)
    // 3
    void blend(RBGColor from) { // 3
        this.red += from.red;
        this.green += from.green;
        this.blue += from.blue;
    }

    // 4 pas de sens : static void blend(RBGColor c)
    // 5
    void blend(RGBColor c1, RGBColor c2) { // 5
        this.red = normalize(c1.red + c2.red);
        this.green = normalize(c1.green + c2.green);
        this.blue = normalize(c1.blue + c2.blue);
    }

    // 6 pas de sens : static RBGColor blend(RBGColor c1, RBGColor c2) 
