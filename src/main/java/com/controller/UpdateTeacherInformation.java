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
import com.model.entidades.Teacher;

/**
 * Servlet implementation class UpdateTeacherInformation
 */
@WebServlet("/UpdateTeacherInformation")
public class UpdateTeacherInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeacherInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = 4;
		Teacher teacher_information = DAOFactory.getFactory().getTeacherDAO().getByID(id);
		String clave = teacher_information.getClave();
		//String cedula = teacher_information.getCedula();
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String cedula = request.getParameter("identityNumber");
		String departamento= request.getParameter("department");
		System.out.println(cedula);
		
		Teacher teacher = new Teacher();
		
		teacher.setIdUsuario(4); //OJO: se debe setear el Id del usuario NO del teacher, caso contrario inserta uno nuevo
		teacher.setRol("Teacher");		
		teacher.setApellido(apellido);
		teacher.setCedula(cedula);
	teacher.setClave(clave);
	teacher.setNombre(nombre);
	
		//Se meustran todos los departamentos disponibles
	List<Department> deptos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
	System.out.println(deptos.size());
	for(int i =0; i<deptos.size(); i++) {
		if(deptos.get(i).getIdDepartment()==Integer.parseInt(departamento)) {
			teacher.setDepartamento(deptos.get(i));
		}
	}
		//Recuperar departamento
	//Department resultado = DAOFactory.getFactory().getDapartmentDAO().getByID(1);
		//System.out.println("Resultado:" + resultado.getNombreDepartamento());
		//Seteo el dep en el teacher
		//teacher.setDepartamento(deptos.get(Integer.parseInt(departamento)));
	DAOFactory.getFactory().getTeacherDAO().update(teacher);
		
	presentar(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String url = "/jsp/ViewTeacherViewInformation.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
}
