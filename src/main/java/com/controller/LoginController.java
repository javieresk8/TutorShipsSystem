package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.dao.DAOFactory;
import com.model.entidades.User;

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
		response.sendRedirect("jsp/ViewLogin.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cedula = request.getParameter("identityNumber");
		String clave = request.getParameter("password");
		String rol = request.getParameter("userType");
		
		//List<User> users = DAOFactory.getFactory().getUserDAO().getUsers();
		
		//String idUsuario = 

		System.out.println("\n"+rol);
		System.out.println(clave);
		System.out.println(cedula);
		
		User usuario = DAOFactory.getFactory().getUserDAO().authorize(cedula, clave, rol);
		List<User> users = DAOFactory.getFactory().getUserDAO().getUsers();
		if (usuario!=null) {
			if( rol.equals("Admin")) {
				HttpSession session = request.getSession();
				//session.setAttribute("idUsuario", idUsuario);
				request.getRequestDispatcher("/MenuAdminController").forward(request, response);
			}
			else if ( rol.equals("Teacher")) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario Logueado", usuario);
				request.getRequestDispatcher("/MenuTeacherController").forward(request, response);
			}
			else if (rol.equals("Student")) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario Logueado", usuario);
				request.getRequestDispatcher("/MenuStudentController").forward(request, response);
			}
		}else {
			//String url = "/jsp/ViewAuthenticationInformation.jsp";
			//request.getRequestDispatcher(url).forward(request, response); 
			response.sendRedirect("jsp/ViewLogin.jsp");
		}
		
		/*
		if(rol.equals("Administrative")) {
			HttpSession session = request.getSession();
			//session.setAttribute("usuario Logueado", usuario);
			request.getRequestDispatcher("/MenuAdminController").forward(request, response);
			
		}
		else if (rol.equals("Student")) {
			HttpSession session = request.getSession();
			//session.setAttribute("usuario Logueado", usuario);	
			request.getRequestDispatcher("/MenuStudentController").forward(request, response);
			//request.getRequestDispatcher("/MenuStudentController").forward(request, response);
		}
		else if (rol.equals("Teacher")) {
			HttpSession session = request.getSession();
			//session.setAttribute("usuario Logueado", usuario);			
			request.getRequestDispatcher("/MenuTeacherController").forward(request, response);
		}
		else {
			// redirect again  to login not using Dispatcher
			response.sendRedirect("jsp/ViewLogin.jsp");
		}*/
		
		
	}

}
