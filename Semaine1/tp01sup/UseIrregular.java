public class UseIrregular {
        public static void main(String[] args) {
            int[] lineSize = {3, 1, 2};
            Irregular irregular = new Irregular(lineSize);
            irregular.randomFilling();
            System.out.println(irregular.display());
        
            int testElement = 0; // Nombre d'éléments à check
            System.out.println("Est ce que " + testElement + " a des lignes en commun? " + irregular.isCommon(testElement));
            System.out.println("Est ce qu'un élément commun existe dans toutes les lignes? " + irregular.existCommon());
        }
}