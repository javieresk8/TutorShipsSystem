package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Department;

/**
 * Servlet implementation class ListDepartmentController
 */
@WebServlet("/ListDepartmentController")
public class ListDepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListDepartmentController() {
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
		List<Department> departamentos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
		/*
		for(Department d: departamentos) {
			System.out.println("Id: " + d.getIdDepartment()+" Nombre: " + d.getNombreDepartamento());	
		}*/
		//redireccionar a vista
		request.setAttribute("departamentos", departamentos);		
		String url = "/jsp/ViewlistDepartment.jsp";				
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
