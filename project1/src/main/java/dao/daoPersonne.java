package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.Personne;

public class daoPersonne {
public static int AjouterPersonne(Personne P) throws SQLException, ClassNotFoundException {
	connexion.connect();
	int res= connexion.Maj("insert into personne(nom,prenom,login,mdp) values('"+P.getNom()+"','"+P.getPrenom()+"','"+P.getLogin()+"','"+P.getPassword()+"')");
	connexion.disconnect();
	return res;
	
}
public static int SupprimerPersonne(int id) throws ClassNotFoundException, SQLException
{   connexion.connect();
    int res=connexion.Maj("delete from personne where id= "+id);
    connexion.disconnect();
   return res;
}
public static boolean PersonneExiste(String login) throws ClassNotFoundException, SQLException {
	boolean exist = false;
	connexion.connect();
	ResultSet res=connexion.select("select * from personne where login ='"+login+"'");
	if(res.next())
	{exist=true;}
	connexion.disconnect();
	return exist;
}
public static Personne authentification(String login, String password) throws ClassNotFoundException, SQLException {
	ResultSet res=null;
	Personne p=null;
	connexion.connect();
	res=connexion.select("select * from personne where login='"+login+"' and mdp='"+password+"'");
	if(res.next())
	{
		p=new Personne(res.getString("nom"),res.getString("prenom"),res.getString("login"),res.getString("mdp"));
	}
	connexion.disconnect();
	return p;
}
}
