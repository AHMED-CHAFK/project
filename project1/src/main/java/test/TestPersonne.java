package test;

import java.sql.SQLException;

import dao.daoPersonne;
import models.Personne;

public class TestPersonne {
public static void main(String[] args) throws SQLException ,ClassNotFoundException {
	
	Personne p=new Personne("ahmed","chafak","chafakj@gmail.com","password");
	int res=daoPersonne.AjouterPersonne(p);
	if(res==1) {
		System.out.println("bien ajouter");
	}
	else {
		System.out.println("non ajouter");
	}
	
}
}
