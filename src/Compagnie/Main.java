package Compagnie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Micky", "Paris", "0611111111");
        personne.ObtenirInfos();
        Pilote pilote = new Pilote( 1,  5000,1,"01/04/2004", "Theotim", "Paris", "0622222222");
        pilote.ObteniRole();
        pilote.ObtenirInfos();
    }
}