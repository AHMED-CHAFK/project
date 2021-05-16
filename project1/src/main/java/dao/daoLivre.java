package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Livre;

public class daoLivre {
	public static int AjouterLivre(Livre L) throws ClassNotFoundException, SQLException {
		connexion.connect();
		int res=connexion.Maj("insert into livre(titre,nomaueur,categorie) values('"+L.getTitre()+"','"+L.getNomauteur()+"','"+L.getCategorie()+"')");
		connexion.disconnect();
		return res;
	}
	public static int SupprimerLivre(int idl) throws ClassNotFoundException, SQLException
	{
		connexion.connect();
	    int res=connexion.Maj("delete from livre where idl= "+idl);
	    connexion.disconnect();
	   return res;
	}
	public static boolean RechercherLivre(String titre,String categorie) throws ClassNotFoundException, SQLException
	{
		boolean exist = false;
		connexion.connect();
		ResultSet res=connexion.select("select * from livre where titre ='"+titre+"' and categorie='"+categorie+"'");
		if(res.next())
		{exist=true;}
		connexion.disconnect();
		return exist;
	}
	public static List<Livre> allLivre(){
		List<Livre> Livers=new ArrayList<Livre>();
		try {
			connexion.connect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet res = null;
		try {
			res = connexion.select("select * from livre");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (res.next()) {
				Livre L =new Livre(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
				Livers.add(L);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connexion.disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Livers;
	}
}
