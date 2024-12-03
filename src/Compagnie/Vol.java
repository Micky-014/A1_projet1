package Compagnie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDateTime;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat;
    private Pilote pilote;
    private List<PersonnelCabine> equipageCabine = new ArrayList<>();

    public Vol(int numeroVol, String origine, String destination, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Prévu";
    }
    public int getNumeroVol() {
        return numeroVol;
    }
    public String getOrigine() {
        return origine;
    }
    public String getDestination() {
        return destination;
    }
    public LocalDateTime getDateHeureDepart() {
        return dateHeureDepart;
    }
    public LocalDateTime getDateHeureArrivee() {
        return dateHeureArrivee;
    }
    public String getEtat() {
        return etat;
    }
    public Pilote getPilote() {
        return pilote;
    }
    public List<PersonnelCabine> getEquipageCabine() {
        return equipageCabine;
    }
    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }
    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }
    public void setDateHeureArrivee(LocalDateTime dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }
    public void setEquipageCabine(List<PersonnelCabine> equipageCabine) {
        this.equipageCabine = equipageCabine;
    }
    public void getInfos(){
        System.out.println("Numero vol: " + numeroVol);
        System.out.println("Origine: " + origine);
        System.out.println("Destination: " + destination);
        System.out.println("Date heure depart: " + dateHeureDepart);
        System.out.println("Date heure arrivee: " + dateHeureArrivee);
        System.out.println("Etat: " + etat);
        System.out.println("Pilote: " + pilote);
        System.out.println("Equipage cabine: " + equipageCabine);
    }

}
//public void affecterVol(Pilote pilote, List<PersonnelCabine> equipage)