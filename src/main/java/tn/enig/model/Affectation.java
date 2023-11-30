package tn.enig.model;

public class Affectation {
	public static int counter = 1;
	int id,nbh;
	Matiere mat;
	Enseignant ens;
	
	
	public Affectation() {
		this.id = counter++;
		this.ens=new Enseignant();
		this.mat=new Matiere();
	}
	public Affectation(Enseignant ens,Matiere m) {
		this.id = counter++;
		this.mat=m;
		this.ens=ens;
	}
	public Affectation(Enseignant ens,Matiere m,int nbh) {
		this.id = counter++;
		this.mat=m;
		this.ens=ens;
		this.nbh=nbh;
	}

	@Override
	public String toString() {
		return "Affectation [mat=" + mat + ", ens=" + ens + "]";
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNbh() {
		return nbh;
	}


	public void setNbh(int nbh) {
		this.nbh = nbh;
	}


	public Matiere getMat() {
		return mat;
	}


	public void setMat(Matiere mat) {
		this.mat = mat;
	}


	public Enseignant getEns() {
		return ens;
	}


	public void setEns(Enseignant ens) {
		this.ens = ens;
	}

}
