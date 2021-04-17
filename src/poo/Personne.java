package poo;

public class Personne {
private String nom;
private String prenom;
private int age;
private String addresse;
public void Initialiser(String prenom,String nom,String add,int age) {
	this.nom=nom;
	this.prenom=prenom;
	this.addresse=add;
	this.age=age;
}
public void afficher() {
	System.out.println("les attributs:" +this.nom+" "+this.prenom+" "+this.addresse+" "+this.age);
}
}
