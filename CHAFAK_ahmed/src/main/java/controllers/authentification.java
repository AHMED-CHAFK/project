package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Personne;
import models.Role;
import services.servicePersonne;



@WebServlet("/authentification")
public class authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public authentification() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/authentification.jsp").include(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("email");
		String mdp=request.getParameter("mdp");
		Personne p=null;
		 try {
			p=servicePersonne.Authentification(login,mdp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(p==null)
		{
			response.sendRedirect("http://localhost:8081/CHAFAK_ahmed/authentification");

		}
		else
		{ HttpSession session=request.getSession();
		session.setAttribute("personne",p);
			if(p.getRole().equals(Role.ADMIN)) 
			{
				response.sendRedirect("http://localhost:8081/CHAFAK_ahmed/admin.jsp");

			}
			else {

				response.sendRedirect("http://localhost:8081/CHAFAK_ahmed/etudiant.jsp");
			}
		}
	}
	}


