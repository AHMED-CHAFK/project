package services;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.daoCategorie;
import models.Categorie;

public class serviceCategorie {
	
	public static ArrayList<Categorie> listeCategorie() throws SQLException, ClassNotFoundException{
   return daoCategorie.listeCategories();
}}
