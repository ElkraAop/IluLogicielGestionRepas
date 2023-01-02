package Src;

public class Administrateur extends Utilisateur{
private static Client[] listeClients;
private static int nbClients = 0;

public Administrateur(String nom, String prenom, String ardresse, String codePostal, String ville) {
		super(nom, prenom, ardresse, codePostal, ville);
		listeClients = new Client[10000];
	}

public void addClient(String nom, String prenom, String ardresse, String codePostal, String ville) {
	listeClients[nbClients]= new Client(nom, prenom, ardresse, codePostal, ville);
	nbClients++;
}

public String editerLog() {
	String resultat ="";
	for(int i = 0 ; i<this.nbClients;i++) {
		resultat += listeClients[i].facturer() + ";";
	}
	return resultat;
}
public Client getClient(String nom, String prenom) {
	for(int i = 0 ; i<=this.nbClients;i++) {
		 if(listeClients[i].getNom().equals(nom)&& listeClients[i].getPrenom().equals(prenom)) {
			 return listeClients[i];
		 }
	}
	return null;
}
public String Ocamelisation() {
	String resultat = "[]";
	for(int i= 0;i<this.nbClients;i++) {
		resultat+=":: ("+listeClients[i].getNom()+","+listeClients[i].getPrenom()+","+ listeClients[i].facturer()+")";
	}
	return resultat;
}
}
