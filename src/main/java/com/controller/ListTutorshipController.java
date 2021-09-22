package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Tutorship;

/**
 * Servlet implementation class ListTutorshipController
 */
@WebServlet("/ListTutorshipController")
public class ListTutorshipController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Integer id = 7;    /**
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
