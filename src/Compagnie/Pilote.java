package Compagnie;

public class Pilote extends Employe {
    private int licence;
    private int heureDeVol;
    public Pilote(int licence, int heureDeVol, int numeroEmploye, String dateEmbauche, String prenom, String adresse, String contact) {
        super(numeroEmploye, dateEmbauche, prenom, adresse, contact);
        this.licence = licence;
        this.heureDeVol = heureDeVol;
    }
    public int getLicence() {
        return licence;
    }
    public void setLicence(int licence) {
        this.licence = licence;
    }
    public int getHeureDeVol() {
        return heureDeVol;
    }
    public void setHeureDeVol(int heureDeVol) {
        this.heureDeVol = heureDeVol;
    }
}
