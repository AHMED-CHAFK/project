package controles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.Personne;
import services.servicesPersonne;


@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public inscription() {
       
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscription.jsp").include(req,res);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		boolean res=false;
		Personne p=new Personne(req.getParameter("nom"),req.getParameter("prenom"),req.getParameter("login"),req.getParameter("password"));
		try {
			res=servicesPersonne.AjouterPersonne(p);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res)
		{HttpSession session=req.getSession();
		session.setAttribute("per", p);
		resp.sendRedirect("http://localhost:8081/project1/authentification");}
		else
		{resp.sendRedirect("http://localhost:8081/project1/inscription");}
	}

}
