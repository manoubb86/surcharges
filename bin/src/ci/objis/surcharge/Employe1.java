package ci.objis.surcharge;

public class Employe1 {
	
	private int Id;
	private String Nom ;
	private String Prenom;
	
	public Employe1(String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	public Employe1(String Nom, String Prenom, int Id) {
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.Id = Id;
	}
	public Employe1 (String Nom) {
		this.Nom = Nom;
	}
	
	public void consulterConges() {
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getNom() {
		return Nom;
	}	
	public void poserConges(String Nom,  String Prenom) {
		
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	

}
