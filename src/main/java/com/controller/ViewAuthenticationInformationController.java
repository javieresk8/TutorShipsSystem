package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Student;

/**
 * Servlet implementation class ViewAuthenticationInformationController
 */
@WebServlet("/ViewAuthenticationInformationController")
public class ViewAuthenticationInformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Integer id = 17;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAuthenticationInformationController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student informacion = DAOFactory.getFactory().getStudentDAO().getByID(id);

		System.out.println("Id: " + informacion.getIdUsuario() +
				" rol: "+ informacion.getRol()+ 
				" apellido: " + informacion.getApellido() +
				" cedula: " + informacion.getCedula() + 
				" nombre: " + informacion.getNombre() + "clave: " + informacion.getClave()
				);
		String nombre =informacion.getNombre();
		String apellido = informacion.getApellido();
		String cedula = informacion.getCedula();
		String clave = informacion.getClave();
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido", apellido);
		request.setAttribute("cedula", cedula);
		request.setAttribute("clave", clave);
			presentar(request, response);
//		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	presentar(request, response);
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewAuthenticationInformation.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}


}
