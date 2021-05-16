package services;

import java.sql.SQLException;

import dao.daoPersonne;
import models.Personne;

public class servicesPersonne {
	public static boolean AjouterPersonne(Personne p) throws ClassNotFoundException, SQLException {
		boolean exist=daoPersonne.PersonneExiste(p.getLogin());
		if(exist)
		{return false;}
		else
		{
		int res=daoPersonne.AjouterPersonne(p);
		return res==1;
		}
	}

public static Personne Authentification(String login, String password) throws ClassNotFoundException, SQLException {
		
		return daoPersonne.authentification(login,password);
	}

}
