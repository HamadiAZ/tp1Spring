package tn.enig.model;

public class Matiere {
	public static int counter = 1;
	int id;
	String titre;
	int nbh,niveau;
	
	public Matiere() {
		this.id = counter++;
	}

	public Matiere(String titre, int nbh, int niveau) {
		this.id = counter++;
		this.titre = titre;
		this.nbh = nbh;
		this.niveau = niveau;
	}

	public Matiere(int id, String titre, int nbh, int niveau) {
		super();
		this.id = id;
		this.titre = titre;
		this.nbh = nbh;
		this.niveau = niveau;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbh() {
		return nbh;
	}

	public void setNbh(int nbh) {
		this.nbh = nbh;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Matiere [id=" + id + ", titre=" + titre + ", nbh=" + nbh + ", niveau=" + niveau + "]";
	}

	
	
	
	
}
