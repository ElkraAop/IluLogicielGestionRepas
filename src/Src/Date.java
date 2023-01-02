package Src;

public class Date {
private String annee;
private String jour;
private String mois;

public Date(String jour,String mois,String annee) {
	this.jour = jour;
	this.mois = mois;
	this.annee = annee;
}

public String getAnnee() {
	return annee;
}

public String getJour() {
	return jour;
}

public String getMois() {
	return mois;
}

@Override
public String toString() {
	return "Date [annee=" + annee + ", jour=" + jour + ", mois=" + mois + "]";
}


}
