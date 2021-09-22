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
import com.model.entidades.Tutorship;
import com.model.entidades.User;

/**
 * Servlet implementation class ListTutorshipController
 */
@WebServlet("/ListTutorshipController")
public class ListTutorshipController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTutorshipController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		presentar(request, response);
	}
	
	protected void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
		List<Tutorship> tutor = DAOFactory.getFactory().getStudentDAO().getTutorshipsById(id);
		for (Tutorship tutorship : tutor) {
		System.out.println("Id: " + tutorship.getIdTutorship() + "Profesor" + tutorship.getTeacher().getApellido() +
				" Estudiante: " + tutorship.getStudent().getApellido() + "hola" + tutorship.getSchedule().getDia() + tutorship.getSchedule().getHoraInicio() +
				tutorship.getSchedule().getHoraFin());
		}
		request.setAttribute("tutor",tutor);
		String url = "/jsp/ViewListTutorship.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
	

}
