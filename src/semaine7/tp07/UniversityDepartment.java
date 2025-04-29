package semaine7.tp07;

public enum UniversityDepartment {
    F3S(1,"Faculté des Sciences de Santé et du Sport"),
    FST(2,"Faculté des Sciences et Technologies"),
    IUT(3,"Institut Universitaire de Technologies"),
    FSJPS(4,"Faculté des Sciences Juridiques, Politiques et Sociales"),
    FSEST(5,"Faculté des Sciences Économiques, Sociales et des Territoires"),
    FH(6,"Faculté des Humanités"),
    FLCS(7,"Faculté des Langues, Cultures et Sociétés"),
    FPSEF(8,"Faculté de Psychologie, Sciences de l’Education et de la Formation");

    private final int diallingCode;
    private final String labelLong;

    private UniversityDepartment(int diallingCode, String labelLong) {
        this.diallingCode = diallingCode;
        this.labelLong = labelLong;
    }

    public int getDiallingCode() {
        return diallingCode;
    }

    public String getLabelShort() {
        return this.name();
    }

    public String getLabelLong() {
        return labelLong;
    }
}
