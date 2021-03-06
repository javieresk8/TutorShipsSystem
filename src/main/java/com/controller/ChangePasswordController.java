package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.model.dao.DAOFactory;
import com.model.entidades.Student;
import com.model.entidades.User;

/**
 * Servlet implementation class ChangePasswordController
 */
@WebServlet("/ChangePasswordController")
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
		Student informacion = DAOFactory.getFactory().getStudentDAO().getByID(id);
		String clave = informacion.getClave();
		request.setAttribute("clave", clave);
			presentar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
		Student informacion = DAOFactory.getFactory().getStudentDAO().getByID(id);
		String contraseñaNueva = request.getParameter("newPassword");
		String repeatNewPassword = request.getParameter("repeatNewPassword");
		
		if(contraseñaNueva.equals(repeatNewPassword)) {
			informacion.setRol(informacion.getRol()); //Siempre setear el rol
			informacion.setApellido(informacion.getApellido());
			informacion.setCedula(informacion.getCedula());
			informacion.setClave(contraseñaNueva);
			informacion.setNombre(informacion.getNombre()); 
			informacion.setIdUsuario(id);
			DAOFactory.getFactory().getUserDAO().update(informacion);
			System.out.println("La clave se actualizo correctamente");
		}
		else {
			JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
		}
	presentar(request, response);
	} 

	

	
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ChangePassword.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}


}
