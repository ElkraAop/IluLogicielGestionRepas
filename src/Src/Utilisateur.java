package Src;

public class Utilisateur {
private String nom;
private String prenom;
private FicheDonn�e fiche;


public Utilisateur(String nom, String prenom, String ardresse, String codePostal, String ville) {
	this.nom = nom;
	this.prenom = prenom;
	this.fiche = new FicheDonn�e(ardresse, codePostal, ville);
}
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public FicheDonn�e getFiche() {
	return fiche;
}


}
