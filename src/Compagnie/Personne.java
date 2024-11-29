package Compagnie;

public class Personne {
    static private int nombreID = 0;
    private int iD;
    private String prenom;
    private String adresse;
    private String contact;
    public Personne( String prenom, String adresse, String contact) {
        this.iD = setID();
        this.prenom = prenom;
        this.adresse = adresse;
        this.contact = contact;
    }
    static private int setID() {
        return ++nombreID;
    }
    public int getID() {
        return iD;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getContact() {
        return contact;
    }
    public void ObtenirInfos(){
        System.out.println("ID: "+getID());
        System.out.println("Prenom: "+getPrenom());
        System.out.println("Adresse: "+getAdresse());
        System.out.println("Contact: "+getContact());
    }
}
