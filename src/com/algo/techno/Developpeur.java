package com.algo.techno;

public class Developpeur extends Personne {
private String specialite;

	public Developpeur(String specialite) {
	super();
	this.specialite = specialite;
}
	public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}
	@Override
	double calculerSalaire() {
		
		return 0;
	}
	public String afficher() {
		return"";
	}

}
