package Src;

public class Commande {
private int nombreDeRepas;
private int prix;
private Date dateDeLivraison;
private Repas repas;

public Commande(int nombreDeRepas, int prix, Date dateDeLivraison, Repas repas) {

	this.nombreDeRepas = nombreDeRepas;
	this.prix = prix;
	this.dateDeLivraison = dateDeLivraison;
	this.repas = repas;
}

public int getPrix() {
	return prix*nombreDeRepas;
}

public Repas getRepas() {
	return repas;
}

public int getNombreRepas() {
	return nombreDeRepas;
}

public Date getDateDeLivraison() {
	return dateDeLivraison;
}


}
