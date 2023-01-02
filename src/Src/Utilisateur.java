package Src;

public class Utilisateur {
private String nom;
private String prenom;
private FicheDonnée fiche;


public Utilisateur(String nom, String prenom, String ardresse, String codePostal, String ville) {
	this.nom = nom;
	this.prenom = prenom;
	this.fiche = new FicheDonnée(ardresse, codePostal, ville);
}
public String getNom() {
	return nom;
}
public String getPrenom() {
	return prenom;
}
public FicheDonnée getFiche() {
	return fiche;
}


}
