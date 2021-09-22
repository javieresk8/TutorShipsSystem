package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Department;

import java.util.ArrayList;
import java.util.List;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;
import com.model.entidades.Admin;
import com.model.entidades.Department;
import com.model.entidades.Schedule;
import com.model.entidades.Student;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;

/**
 * Servlet implementation class UpdateUserController
 */
@WebServlet("/UpdateUserController")
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String idUser;
	private String rol;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String url="";
    	idUser = request.getParameter("idUser");
    	rol = request.getParameter("rol");
    	System.out.println("\nRol:"+rol+"\n");
    	User user = DAOFactory.getFactory().getUserDAO().getByID(Integer.parseInt(idUser));
    	if(rol.equals("Teacher")) {
    		url = "/jsp/ViewUpdateTeacher.jsp";				    		   		 
    	}else if(rol.equalsIgnoreCase("Student")){
    		System.out.println("Aquii");
    		url = "/jsp/ViewUpdateStudent.jsp";
    	}else {
    		System.out.println("Allaa");
    		url = "/jsp/ViewUpdateAdministrator.jsp";	
    	}
    	
    	request.setAttribute("user", user);	
    	request.getRequestDispatcher(url).forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String rol = request.getParameter("rol");
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String clave = request.getParameter("password");
		String ci = request.getParameter("identityNumber");
		//String idAct = request.getParameter("idAct");	
		//System.out.println(idAct);
		//System.out.println(rol);				
		if(rol.equals("Admin")){
			User ad2 = new Admin();
			ad2.setApellido(apellido);
			ad2.setRol("Admin");
			ad2.setCedula(ci);
			ad2.setClave(clave);
			ad2.setNombre(nombre); 
			ad2.setIdUsuario(Integer.parseInt(idUser));
			DAOFactory.getFactory().getUserDAO().update(ad2);			
			request.getRequestDispatcher("ListUsersController").forward(request, response);
		}else {
			request.getRequestDispatcher("ListDepartmentController").forward(request, response);	
		}		
	}
}
