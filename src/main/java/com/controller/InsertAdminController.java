package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Admin;
import com.model.entidades.Department;
import com.model.entidades.User;

/**
 * Servlet implementation class InsertAdminController
 */
@WebServlet("/InsertAdminController")
public class InsertAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request,response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String ci = request.getParameter("identityNumber");	
		String password = request.getParameter("password");
		
		
		User ad2 = new Admin();
		ad2.setApellido(apellido);
		ad2.setCedula(ci);
		ad2.setClave(password);
		ad2.setNombre(nombre);
		DAOFactory.getFactory().getUserDAO().create(ad2);
		//System.out.println("Se inserto:" + ad2.toString());
		
		request.getRequestDispatcher("ListUsersController").forward(request, response);
		//presentar(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewInsertAdministrator.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}


}
