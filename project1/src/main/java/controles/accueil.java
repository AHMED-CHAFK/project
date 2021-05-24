package controles;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Livre;
import services.servicesLivre;
import services.servicesPersonne;

/**
 * Servlet implementation class accueil
 */
@WebServlet("/ahmed")
public class accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public accueil() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/accueil.jsp").include(request,response);
		System.out.println("salmailikom");
		if(request.getAttribute("idn")!=null) {
		int idl=Integer.parseInt((String)request.getAttribute("idn"));
		   System.out.println("id="+idl);
		   int res=0;
		   try {
			res=servicesLivre.SupprimerLivre(idl);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}   
		
		response.sendRedirect("http://localhost:8081/project1/accueil.jsp");
		   
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  

	}}
