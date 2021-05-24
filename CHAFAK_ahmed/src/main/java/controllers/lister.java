package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Livre;
import services.serviceLivre;
import services.servicePersonne;

/**
 * Servlet implementation class lister
 */
@WebServlet("/lister")
public class lister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lister() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/lister.jsp").include(request, response);	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nom=request.getParameter("nom");
		ArrayList<Livre> l=null;
		try {
			l=serviceLivre.listeLivres(nom);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(l==null)
		{
			response.sendRedirect("http://localhost:8081/CHAFAK_ahmed/authentification");

		}
		else {

			response.sendRedirect("http://localhost:8081/CHAFAK_ahmed/lister.jsp");
		}
	}*/

}}
