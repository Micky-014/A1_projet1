package Compagnie;

public class Pilote extends Employe {
    private int licence;
    private int heureDeVol;
    public Pilote(int licence, int heureDeVol, int numeroEmploye, String dateEmbauche, int iD, String prenom, String adresse, String contact) {
        super(numeroEmploye, dateEmbauche, iD, prenom, adresse, contact);
        this.licence = licence;
        this.heureDeVol = heureDeVol;
    }
    public int getLicence() {
        return licence;
    }
    public int getHeureDeVol() {
        return heureDeVol;
    }
}
