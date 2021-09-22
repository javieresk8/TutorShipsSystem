package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;

import com.model.entidades.User;
import java.util.ArrayList;
import java.util.List;


/**
 * Servlet implementation class ListUsersController
 */
@WebServlet("/ListUsersController")
public class ListUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUsersController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> users = DAOFactory.getFactory().getUserDAO().getUsers();
		/*for(User d: users) {
			System.out.println("Id: " + d.getIdUsuario() +
		" rol: "+ d.getRol()+ 
		" apellido: " + d.getApellido() +
		" cedula: " + d.getCedula() + 
		" nombre: " + d.getNombre());	
		}*/
		request.setAttribute("users", users);
		String url = "/jsp/ViewListUser.jsp";				
		request.getRequestDispatcher(url).forward(request, response);		
	}
}
