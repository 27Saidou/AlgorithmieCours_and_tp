package com.algo.techno;

public abstract class Personne {
private int id;
private String nom;
private String mail;
private double salaire;
private String telephone;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public double getSalaire() {
	return salaire;
}

public void setSalaire(double salaire) {
	this.salaire = salaire;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

abstract double calculerSalaire();
}
