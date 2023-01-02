package Src;

public class FicheDonnée {
private String ardresse;
private String codePostal;
private String ville;

public FicheDonnée(String ardresse, String codePostal, String ville) {

	this.ardresse = ardresse;
	this.codePostal = codePostal;
	this.ville = ville;
}

public String getArdresse() {
	return ardresse;
}
public void setArdresse(String ardresse) {
	this.ardresse = ardresse;
}
public String getCodePostal() {
	return codePostal;
}
public void setCodePostal(String codePostal) {
	this.codePostal = codePostal;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}

}
