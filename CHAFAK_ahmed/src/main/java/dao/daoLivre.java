package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.*;

public class daoLivre {
	
	
	public static Livre LivreParId(int id) throws ClassNotFoundException, SQLException {
		Livre l=null ;
		Connexion.Connect();
		ResultSet res = Connexion.Select("select * from livre where id="+id);
		if(res.next()) {
			
l=new Livre(res.getInt(1),res.getInt(2),res.getString(3),res.getString(4),res.getString(5),res.getInt(6),null,null);

			
		}
		Connexion.Disconnect();
		return l;
	}
	public static ArrayList<Livre> listeLivres() throws SQLException, ClassNotFoundException{
		ArrayList<Livre> livres = new ArrayList<Livre>();
		Connexion.Connect();
		ResultSet res = Connexion.Select("select * from livre");
		while(res.next()) {
			Livre l =new Livre(res.getInt(1), res.getInt(2), res.getString(3),res.getString(4),res.getString(5),res.getInt(6),null, null);
			l.setCategorie(daoCategorie.CategorieParId(res.getInt(7)));
			l.setAuteur(daoPersonne.PersonneParId(res.getInt(8)));
			livres.add(l);
		}
		Connexion.Disconnect();
		return livres;
	}
	public static int AjouterLivre(Livre l) throws ClassNotFoundException, SQLException {
		int x=daoCategorie.getIdCatByName(l.getCategorie().getNom());
		int y=daoPersonne.getIdPerByName(l.getAuteur().getNom());
		
	
		Connexion.Connect();
		int res = Connexion.Maj("INSERT INTO livre(isbn, titre, genre, description, annee_edition,idcategorie,idauteur) VALUES ("+l.getIsbn()+",'"+l.getTitre()+"','"+l.getGenre()+"','"+l.getDescription()+"',"+l.getAnnee_edition()+","+x+","+y+")");
		Connexion.Disconnect();
		return res;
	}
		
	public static boolean LivreExiste(int isbn) throws ClassNotFoundException, SQLException {
		boolean exist = false ;
		Connexion.Connect();
		ResultSet res = Connexion.Select("select * from livre where isbn="+isbn);
		if(res.next()) {
			exist=true;
		}
		Connexion.Disconnect();
		return exist;
	}
	
	public static ArrayList<Livre> listeLivres(String nom) throws SQLException, ClassNotFoundException{
		int idc=daoCategorie.getIdCatByName(nom);
		ArrayList<Livre> livres = new ArrayList<Livre>();
		Connexion.Connect();
		ResultSet res = Connexion.Select("select * from livre where idcategorie="+idc);
		while(res.next()) {
			Livre l =new Livre(res.getInt(1), res.getInt(2), res.getString(3),res.getString(4),res.getString(5),res.getInt(6),null, null);
			l.setCategorie(daoCategorie.CategorieParId(res.getInt(7)));
			l.setAuteur(daoPersonne.PersonneParId(res.getInt(8)));
			livres.add(l);
		}
		Connexion.Disconnect();
		return livres;
	}
	
}
