package classes;

public class Article {
	private String sujet;
	private String description;
	private int nb_jaime;
	private int nb_naime;
	public Article(String sujet,String description,int nb_jaime,int nb_naime) {
		this.sujet=sujet;
		this.description=description;
		this.nb_jaime=nb_jaime;
		this.nb_naime=nb_naime;
	}
	public String getSujet() {
		return this.sujet;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getN_aime() {
		return this.nb_jaime;
	}
	public int getN_naime() {
		return this.nb_naime;
	}
	public void setSujet(String sujet) {
		this.sujet=sujet;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public void setN_aime(int aime) {
		this.nb_jaime=aime;
	}
	public void setN_naime(int naime) {
		this.nb_naime=naime;
	}
}
