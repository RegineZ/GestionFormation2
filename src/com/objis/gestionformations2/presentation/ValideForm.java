package com.objis.gestionformations2.presentation;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.objis.gestionformations.metier.User;
//TODO recuperer le code de la Servlet

/**
 * Servlet implementation class ValideForm
 */

public class ValideForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValideForm() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html");
			// Etape 1 : Récupération des paramètres de la requête :
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String login = request.getParameter("login");
			String email = request.getParameter("email");
			String mdp = request.getParameter("mdp");
	
			// Etape 2 : Création Session http à partir de l'objet request
			HttpSession session = request.getSession();

			// Etape 3 : Mise en atttribut de session des paramètres de requête
			session.setAttribute("nom", nom);
			session.setAttribute("prenom", prenom);
			session.setAttribute("login", login);
			session.setAttribute("email", email);
			session.setAttribute("mdp", mdp);

		
			// Etape 4 : Redirection vers JSP
			RequestDispatcher dispatcher = null;
			dispatcher = request.getRequestDispatcher("/demoel.jsp");
			dispatcher.forward(request, response);
	}

}
