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
import com.model.entidades.Department;

/**
 * Servlet implementation class DeleteDepartmentController
 */
@WebServlet("/DeleteDepartmentController")
public class DeleteDepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String idDepartamento = request.getParameter("idDepartamento");
    	//System.out.println(request.getParameter("idDepartamento"));
		DAOFactory.getFactory().getDapartmentDAO().deleteByID(Integer.parseInt(idDepartamento));		
		request.getRequestDispatcher("ListDepartmentController").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idDepartamento = request.getParameter("idDepartamento");
		System.out.println(request.getParameter("idDepartamento"));
		DAOFactory.getFactory().getDapartmentDAO().deleteByID(Integer.parseInt(idDepartamento));
		request.getRequestDispatcher("ListDepartmentController").forward(request, response);	
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ListDepartmentController").forward(request, response);	
	}

}
