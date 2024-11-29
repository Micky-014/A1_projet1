package Compagnie;

public class PersonnelCabine extends Employe {    private int licence;
    private String qualification;
    public PersonnelCabine(String qualification, int numeroEmploye, String dateEmbauche, String prenom, String adresse, String contact) {
        super(numeroEmploye, dateEmbauche, prenom, adresse, contact);
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
}
