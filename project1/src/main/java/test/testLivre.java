package test;

import java.sql.SQLException;

import dao.daoLivre;
import models.Livre;

public class testLivre {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Livre L=new Livre("Guide de la flexibilité de l'organisation et de l'environnement de travail","Kardham","18 ans plus");
		int res=daoLivre.AjouterLivre(L);
		if(res==1) {
			System.out.print("bien ajouter");
		}
		else {
			System.out.print("n ajoute pas");
		}
		
		

	}

}
