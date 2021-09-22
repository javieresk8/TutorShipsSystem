package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Department;

/**
 * Servlet implementation class UpdateDepartmentController
 */
@WebServlet("/UpdateDepartmentController")
public class UpdateDepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String idDepartamento;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDepartmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.print(request.getParameter("departamento"));
    	idDepartamento = request.getParameter("idDepartamento");
    	presentar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nuevoNombreDepartamento = request.getParameter("name");
		Department dep = new Department();
		dep.setNombreDepartamento(nuevoNombreDepartamento);
		dep.setIdDepartment(Integer.parseInt(idDepartamento)); //Ingresa  el id del objeto que quieres actualizar
		DAOFactory.getFactory().getDapartmentDAO().update(dep);
		
		request.getRequestDispatcher("ListDepartmentController").forward(request, response);		
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewUpdateDepartment.jsp";				
		request.getRequestDispatcher(url).forward(request, response);		
	}

}
