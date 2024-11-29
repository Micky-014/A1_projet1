package Compagnie;

public class PersonnelCabine extends Employe {    private int licence;
    private String qualification;
    public PersonnelCabine(String qualification, int numeroEmploye, String dateEmbauche, int iD, String prenom, String adresse, String contact) {
        super(numeroEmploye, dateEmbauche, iD, prenom, adresse, contact);
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
}
