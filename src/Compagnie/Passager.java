package Compagnie;

public class Passager extends Personne{
    private String passeport;
    public Passager(int numeroEmploye, String dateEmbauche, int iD, String prenom, String adresse, String contact){
        super(iD, prenom, adresse, contact);
        this.passeport = passeport;
    }
    public String getPasseport() {
        return passeport;
    }
    public void ObtenirInfos(){
        super.ObtenirInfos();
        System.out.println("Passeport" + passeport);
    }
}