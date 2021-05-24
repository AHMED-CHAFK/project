package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.daoLivre;
import models.Livre;

public class servicesLivre {
	public static ArrayList<Livre> getallLivre()
	{
		return (ArrayList<Livre>) daoLivre.allLivre();
		
	}
public static boolean Exist(String titre,String categorie) throws ClassNotFoundException, SQLException {
	return daoLivre.RechercherLivre(titre, categorie);
	
}
public static List<Livre> listeparcategorie(String categorie){
 
	return daoLivre.listeparcategorie(categorie);
}
public static int SupprimerLivre(int idl) throws ClassNotFoundException, SQLException
{return daoLivre.SupprimerLivre(idl);
	}
}
