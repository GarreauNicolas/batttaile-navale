package batteau;

public class Batteau {
	
	private  String nom;
	private  int taille ;

	public Batteau(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	public String toString() {
		return "le nom du batteau est :"+this.nom+" ,sa taille est de : "+this.taille;
	}
	
///////////////getter/setter///////////////////////////////
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
//////////////////////////////////////////////////////////
	
}
