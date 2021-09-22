package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;

/**
 * Servlet implementation class DeleteUserController
 */
@WebServlet("/DeleteUserController")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String idUser = request.getParameter("idUser");    	
    	DAOFactory.getFactory().getUserDAO().deleteByID(Integer.parseInt(idUser));		
		request.getRequestDispatcher("ListUsersController").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idUser = request.getParameter("idUser");    	
    	DAOFactory.getFactory().getUserDAO().deleteByID(Integer.parseInt(idUser));		
		request.getRequestDispatcher("ListUsersController").forward(request, response);	
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ListUsersController").forward(request, response);	
	}

}
