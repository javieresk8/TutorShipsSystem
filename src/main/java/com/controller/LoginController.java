package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.dao.DAOFactory;
import com.model.entidades.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("jsp/login.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cedula = request.getParameter("cedula");
		String clave = request.getParameter("clave");
		String rol = request.getParameter("rol");
		
		boolean usuario = DAOFactory.getFactory().getUserDAO().authorize(cedula, clave, rol);
		
		if(usuario==true && rol.equals("Admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario Logueado", usuario);
			request.getRequestDispatcher("/MenuAdminController").forward(request, response);
		}
		else if (usuario==true && rol.equals("Teacher")) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario Logueado", usuario);
			request.getRequestDispatcher("/MenuTeacherController").forward(request, response);
		}
		else if (usuario==true && rol.equals("Student")) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario Logueado", usuario);
			request.getRequestDispatcher("/MenuStudentController").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/LoginController").forward(request, response);
		}
	}

}
