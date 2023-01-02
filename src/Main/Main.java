package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Src.Date;
import Src.Administrateur;
import Src.Client;
import Src.Repas;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int prixRepas = 3;
		String anLivraison;
		String moisLivraison;
		String jourLivraison;
		String villeClient ;
		String CPClient ;
		String adresseClient ;
		String prenomClient ;
		String nomClient ;
		Repas repas = Repas.VIANDE;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Création de l'administrateur :");
		System.out.println("Nom administrateur : ");
			String nomAdmin = br.readLine();
			System.out.println("Prénom administrateur : ");
			String prenomAdmin = br.readLine();
			System.out.println("Adresse administrateur : ");
			String adresseAdmin = br.readLine();
			System.out.println("Code postal administrateur : ");
			String CPAdmin = br.readLine();
			System.out.println("Ville administrateur : ");
			String villeAdmin = br.readLine();
			Administrateur adm = new Administrateur(nomAdmin, prenomAdmin, adresseAdmin, CPAdmin, villeAdmin);
			
			boolean boucle = true;
			boolean boucle2 = true;
			boolean boucleRepas = true;
			while(boucle) {
				System.out.println("Entrez le numéro de l'action que vous désirez effectuer :");
				System.out.println("1 - Ajouter un client");
				System.out.println("2 - Selectioner un client :");
				System.out.println("3 - Editer le ficher log :");
				System.out.println("4 - Quitter l'application :");
				String action = br.readLine();
				switch(action) {
					case "1":
						System.out.println("Entrez les information suivantes ");
						System.out.println("Nom client : ");
						 nomClient = br.readLine();
						System.out.println("Prénom client : ");
						 prenomClient = br.readLine();
						System.out.println("Adresse client : ");
						 adresseClient = br.readLine();
						System.out.println("Code postal client : ");
						 CPClient = br.readLine();
						System.out.println("Ville client : ");
						 villeClient = br.readLine();
						adm.addClient(nomClient, prenomClient, adresseClient, CPClient, villeAdmin);
						System.out.println("Le client a bien été ajouter a votre base de données séléctioné votre prochaine action :");
						break;
					case "2":
						
						System.out.println("Prénom client : ");
						prenomClient = br.readLine();
						System.out.println("Adresse client : ");
						 nomClient = br.readLine();
						Client clt = adm.getClient(nomClient, prenomClient);
						while(boucle2) {
							System.out.println("Entrez le numéro de l'action que vous désirez effectuer :");
							System.out.println("1 - Ajouter une commande");
							System.out.println("2 - Annuler une commande :");
							System.out.println("3 - Facturer :");
							System.out.println("4 - Revenir au menu principale:");
							String actionBis = br.readLine();
							switch(actionBis) {
								case "1":
									System.out.println("Entrez les information suivantes ");
									System.out.println("Nombre de repas : ");
									 String nombreRepas = br.readLine();
									System.out.println("Jour livraison : ");
									jourLivraison = br.readLine();
									System.out.println("Mois livraison : ");
									 moisLivraison = br.readLine();
									System.out.println("Année de livraison : ");
									 anLivraison = br.readLine();
									 
									 System.out.println("choisisez le type de repas a livrer :");
									 System.out.println("1 - Viande");
									 System.out.println("2 - Poisson");
									 System.out.println("3 - Vegetarien");
									 
									 while (boucleRepas) {
										 String TypeRepas = br.readLine();
										 boucleRepas = false;									
										 switch (TypeRepas) {
										case "1":
											 repas = Repas.VIANDE;
											break;
										case "2":
											 repas = Repas.POISSON;
											break;
										case "3":
											 repas = Repas.VEGETARIEN;
											break;
	
										default:
											boucleRepas = true;	
											break;
										} 
									 }
									clt.ajouterCommande(Integer.parseInt(nombreRepas), prixRepas, new Date(jourLivraison,moisLivraison,anLivraison), repas);
									break;
								case "2":
									System.out.println("Jour livraison : ");
									jourLivraison = br.readLine();
									System.out.println("Mois livraison : ");
									moisLivraison = br.readLine();
									System.out.println("Année de livraison : ");
									anLivraison = br.readLine();
									clt.annulerCommande(new Date(jourLivraison,moisLivraison,anLivraison));
									break;
								case "3":
									System.out.println(clt.facturer());
									break;
								case "4":
									boucle2 = false;
									break;
								default:
									System.out.println("action non valable merci d'entrer une action possible ");
								
							}
						}
						
						break;
					case "3": System.out.println(adm.editerLog());
						break;
					case "4": 
						System.out.println("Merci et a bientot");
						boucle=false;
						break;
					default : 
					System.out.println("Commande inconnue merci de choisir une option valable");
				}
					
			}

	}

}
