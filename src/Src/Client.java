package Src;

public class Client extends Utilisateur {
private final int NOMBRE_MAX_REPAS = 100;
//ce paramétre n'a pas de lieux d'être si on utilise une linked list
 private Commande[] commandeFutur;
 private int nbCommandeAVenir;
 private Commande[] commandeFacture;
 private int nbCommandeAPayer;
 
 public Client(String nom, String prenom, String ardresse, String codePostal, String ville) {
	 super(nom, prenom, ardresse, codePostal, ville);
	 this.commandeFutur = new Commande[NOMBRE_MAX_REPAS];
	 this.commandeFacture = new Commande[NOMBRE_MAX_REPAS];
	 this.nbCommandeAPayer = 0;
	 this.nbCommandeAVenir = 0;
}
 
 public void ajouterCommande(int nombreDeRepas, int prix, Date dateDeLivraison, Repas repas) throws IndexOutOfBoundsException{
	 if (this.nbCommandeAVenir == this.NOMBRE_MAX_REPAS)
		 throw new IndexOutOfBoundsException("Le client doit payer ces 100 repas passéz pour pouvoir recommander");
	 this.nbCommandeAVenir++;
	 this.commandeFutur[this.nbCommandeAVenir]= new Commande(nombreDeRepas, prix, dateDeLivraison, repas);
 }
 
private int  trouverCommande(Date dateDeLivraison) {
	for(int i = 0; i<this.nbCommandeAVenir; i++) {
		if(this.commandeFutur[i].getDateDeLivraison()== dateDeLivraison) {
			return i;
		}
	}
	return -1;
	
}

private void decalerTableau(int indice) throws IllegalArgumentException{
	if(indice<0 ||  this.nbCommandeAVenir<indice)
		throw new IllegalArgumentException("indice non valide (client 37)");
	for(int i = indice ;i<this.nbCommandeAVenir;i++) {
		this.commandeFutur[i] = this.commandeFutur[i+1];
	}
}
 public void annulerCommande(Date dateDeLivraison) throws IndexOutOfBoundsException{
	 int indiceCommande = trouverCommande(dateDeLivraison);
	 decalerTableau(indiceCommande);
	 
 }

 public String facturer() {
	 String listeRepasLivree = "";
	 this.commandeFacture = this.commandeFutur;
	 for(int i= 0; i<this.nbCommandeAPayer;i++) {
		 listeRepasLivree += 
				  "" + this.commandeFacture[i].getRepas()
				 +","+ this.commandeFacture[i].getNombreRepas()
				 +","+ this.commandeFacture[i].getPrix()+"\n";
	 }
	 return listeRepasLivree;
 }
}
