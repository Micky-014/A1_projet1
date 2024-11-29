package Compagnie;

public class Employe extends Personne{
    private int numeroEmploye;
    private String dateEmbauche;
    public Employe(int numeroEmploye, String dateEmbauche, int iD, String prenom, String adresse, String contact){
        super(iD, prenom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }
    public int getNumeroEmploye() {
        return numeroEmploye;
    }
    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void ObtenirInfos(){
        super.ObtenirInfos();
        System.out.println("Numéro Employé" + numeroEmploye);
        System.out.println("Date Embauche: " + dateEmbauche);
    }
    public void ObteniRole(){
        System.out.println("Role"+getClass().getName());
    }
}
