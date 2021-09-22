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
import com.model.entidades.Admin;
import com.model.entidades.Department;
import com.model.entidades.Schedule;
import com.model.entidades.Student;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;



/**
 * Servlet implementation class InsertTeacherController
 */
@WebServlet("/InsertTeacherController")
public class InsertTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Department> deptos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
		request.setAttribute("deptos", deptos);
		String url = "jsp/ViewInsertTeacher.jsp";				
		request.getRequestDispatcher(url).forward(request, response);
		//presentar(request,response);		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String ci = request.getParameter("identityNumber");	
		String password = request.getParameter("password");
		
		String idDepartamento = request.getParameter("department");
		int idDept = Integer.parseInt(idDepartamento);
		
		Teacher teacher = new Teacher();
		teacher.setApellido(apellido);
		teacher.setCedula(ci);
		teacher.setClave(password);
		teacher.setNombre(nombre);
		
		Department resultado = DAOFactory.getFactory().getDapartmentDAO().getByID(idDept);
		
		teacher.setDepartamento(resultado);
		DAOFactory.getFactory().getTeacherDAO().create(teacher);
		
		request.getRequestDispatcher("ListUsersController").forward(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewInsertTeacher.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
