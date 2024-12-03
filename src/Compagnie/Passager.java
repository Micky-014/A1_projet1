package Compagnie;

import java.util.HashMap;

public class Passager extends Personne{
    private String passeport;
    private static HashMap<Integer,Vol> volReserve;
    private static HashMap<Integer,Reservation> listeReservation;
    public Passager(int numeroEmploye, String dateEmbauche, String prenom, String adresse, String contact){
        super(prenom, adresse, contact);
        this.passeport = passeport;
    }
    public String getPasseport() {
        return passeport;
    }
    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }
    public void ObtenirInfos(){
        super.ObtenirInfos();
        System.out.println("Passeport: " + passeport);
    }
    public void reserverVol(Vol vol){
        volReserve.put(vol.getNumeroVol(),vol);
        Reservation reservation = new Reservation();
        reservation.getVol(vol);
        reservation.addResVol(vol);
    }
    public void annulerReservation(int idRes){
        Reservation reservation = listeReservation.get(idRes);
        listeReservation.remove(idRes);
        Vol vol =reservation.getResVol();
        volReserve.remove(vol.getNumeroVol());
        reservation.suprimerResVol(vol);
        reservation.suprimerVol(vol);
        reservation.annulerReservation(idRes);
    }
    public void confirmerReservation(int idRes){
        Reservation reservation = listeReservation.get(idRes);
        reservation.setStatut("Annulée");
    }
    public void obtenirReservation(int idRes){
        Reservation reservation = listeReservation.get(idRes);
        reservation.getInfos();
    }
}