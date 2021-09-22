package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Schedule;

/**
 * Servlet implementation class RequestTutorshipController
 */
@WebServlet("/RequestTutorshipController")
public class RequestTutorshipController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTutorshipController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Schedule> sc = DAOFactory.getFactory().getTeacherDAO().getByID(4).getSchedule();
		for (Schedule s : sc) {
					System.out.println("Id: " + s.getIdSchedule() + " Dia: " + s.getDia() + s.getHoraInicio() + s.getHoraFin());	
				}
		request.setAttribute("horarios", sc);
		presentar(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	}
	
	protected void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewRequestTutorship.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
}
