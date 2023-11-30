package tn.enig.model;

public class Enseignant {
	public static int counter = 1;
	int id;
	String nom,Prenom;
	int charge;
	
	public Enseignant() {
		this.id = counter++;
	}

	public Enseignant(int id, String nom, String prenom, int charge) {
		super();
		this.id = id;
		this.nom = nom;
		this.Prenom = prenom;
		this.charge = charge;
	}

	public Enseignant(String nom, String prenom, int charge) {
		this.id = counter++;
		this.nom = nom;
		Prenom = prenom;
		this.charge = charge;
	}

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

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", Prenom=" + Prenom + ", charge=" + charge + "]";
	}

}
