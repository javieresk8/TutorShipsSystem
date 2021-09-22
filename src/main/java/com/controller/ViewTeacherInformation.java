package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.dao.DAOFactory;
import com.model.entidades.Department;
import com.model.entidades.Teacher;
import com.model.entidades.User;

@WebServlet("/ViewTeacherInformation")
public class ViewTeacherInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTeacherInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
		Teacher teacher_information = DAOFactory.getFactory().getTeacherDAO().getByID(id);
		List<Department> departamentos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
		String nombre = teacher_information.getNombre();
		String apellido = teacher_information.getApellido();
		String cedula = teacher_information.getCedula();
		System.out.println(cedula);
		request.setAttribute("nombre" , nombre);
		request.setAttribute("apellido" , apellido);
		request.setAttribute("cedula" , cedula);
		request.setAttribute("departamentos", departamentos);
		presentar(request,response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	
		String url = "/jsp/ViewTeacherViewInformation.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
