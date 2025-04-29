package semaine7.tp07;

import tdOO.td01.PhoneNumber;

public class ProPhoneNumber {
    private PhoneNumber numbers;
    private UniversityDepartment dept;
    private String lastFourDigits;

    public ProPhoneNumber(String lastFourDigits, UniversityDepartment department) {
        // lastFourDigits doit être de longueur 4
        if (lastFourDigits == null || lastFourDigits.length() != 4) {
            throw new IllegalArgumentException("lastFourDigits must be exactly 4 digits.");
        }
        try {
            Integer.parseInt(lastFourDigits); // Vérifier que ce sont bien des chiffres
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("lastFourDigits must contain only digits.");
        }
        this.lastFourDigits = lastFourDigits;
        int one = Integer.parseInt(lastFourDigits.substring(0, 2));
        int two = Integer.parseInt(lastFourDigits.substring(2, 4));
        // Pour respecter le format attendu, on met le troisième groupe à 0
        this.numbers = new PhoneNumber(33, 3, 20, department.getDiallingCode(), one, two);
        this.dept = department;
    }

    public UniversityDepartment getDepartment() {
        return this.dept;
    }

    public String internToString() {
        // Format: <code département><4 derniers chiffres>(<label court>)
        return this.dept.getDiallingCode() + this.lastFourDigits + "(" + this.dept.getLabelShort() + ")";
    }

    public String externToString() {
        // Format attendu : +33.3.20.0X.XX.XX (label long)
        // Format des 4 derniers chiffres : XX.XX
        String lastFourFormatted = this.lastFourDigits.substring(0, 2) + "." + this.lastFourDigits.substring(2, 4);
        
        return String.format("+33.3.20.%02d.%s (%s)", 
                            this.dept.getDiallingCode(),
                            lastFourFormatted, // Utilisation des 4 chiffres formatés
                            this.dept.getLabelLong());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ProPhoneNumber) {
            ProPhoneNumber other = (ProPhoneNumber) obj;
            return this.lastFourDigits.equals(other.lastFourDigits) && this.dept.equals(other.dept);
        } else if (obj instanceof String) {
            return this.equals((String) obj);
        }
        return false;
    }

    public boolean equals(String fourDigits) {
        return this.lastFourDigits.equals(fourDigits);
    }
}
