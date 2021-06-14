package com.algo.techno;

public class Manager extends Personne {
private String service;

	public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
	public Manager(String service) {
	super();
	this.service = service;
}
	@Override
	double calculerSalaire() {
		
		return 0;
	}
	public void afficher() {
		
	}

}
