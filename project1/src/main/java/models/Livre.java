package models;

import java.sql.Date;

public class Livre {
	private int idl;
	private String titre;
	private String nomauteur;
	private String categorie;
	@Override
	public String toString() {
		return "livre [idl=" + idl + ", titre=" + titre + ", nomauteur=" + nomauteur + ", categorie=" + categorie + "]";
	}
	public Livre(String titre, String nomauteur, String categorie) {
		this.titre = titre;
		this.nomauteur = nomauteur;
		this.categorie = categorie;
	}
	public Livre(int idl, String titre, String nomauteur, String categorie) {
		this.idl = idl;
		this.titre = titre;
		this.nomauteur = nomauteur;
		this.categorie = categorie;
	}
	public int getIdl() {
		return idl;
	}
	public void setIdl(int idl) {
		this.idl = idl;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomauteur() {
		return nomauteur;
	}
	public void setNomauteur(String nomauteur) {
		this.nomauteur = nomauteur;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
