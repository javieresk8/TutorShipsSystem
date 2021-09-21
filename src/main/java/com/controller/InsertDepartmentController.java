package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.entidades.Department;


/**
 * Servlet implementation class InsertDepartmentController
 */
@WebServlet("/InsertDepartmentController")
public class InsertDepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDepartmentController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		Department d = new Department();
		d.setNombreDepartamento(nombre);
		com.model.dao.DAOFactory.getFactory().getDapartmentDAO().create(d);
		request.getRequestDispatcher("ListDepartmentController").forward(request, response);
		//presentar(request, response);
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewInsertDepartment.jsp";				
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
