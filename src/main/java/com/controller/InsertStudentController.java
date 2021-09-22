package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;

import com.model.entidades.Student;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;

/**
 * Servlet implementation class InsertStudentController
 */
@WebServlet("/InsertStudentController")
public class InsertStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String ci = request.getParameter("identityNumber");	
		String password = request.getParameter("password");
		
		User st = new Student();				
		st.setApellido(apellido);
		st.setCedula(ci);
		st.setClave(password);
		st.setNombre(nombre);
		DAOFactory.getFactory().getUserDAO().create(st);
		request.getRequestDispatcher("ListUsersController").forward(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewInsertStudent.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
}
