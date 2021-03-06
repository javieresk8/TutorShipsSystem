package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
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
 * Servlet implementation class ListRegisteredTutorshipController
 */
@WebServlet("/ListRegisteredTutorshipController")
public class ListRegisteredTutorshipController extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListRegisteredTutorshipController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
	List<Tutorship> tutorias = DAOFactory.getFactory().getTeacherDAO().getTutorshipsById(id);
				for (Tutorship tutorship : tutorias) {
				System.out.println("Id: " + tutorship.getIdTutorship() + "Profesor" + tutorship.getTeacher().getApellido() +
				" Estudiante: " + tutorship.getStudent().getApellido() + tutorship.getStudent().getNombre()+" "+ tutorship.getSchedule().getDia());
				}
	request.setAttribute("tutorias", tutorias);
	
		presentar(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	presentar(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewListRegisteredTutorship.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
