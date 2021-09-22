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
import com.model.entidades.Schedule;
import com.model.entidades.Teacher;
import com.model.entidades.User;

/**
 * Servlet implementation class ListTeacherAvailableHoursController
 */
@WebServlet("/ListTeacherAvailableHoursController")
public class ListTeacherAvailableHoursController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTeacherAvailableHoursController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	presentar(request, response);
	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer id = usuario.getIdUsuario();
		Teacher t = DAOFactory.getFactory().getTeacherDAO().getByID(id);
		List<Schedule> horarios =  t.getSchedule();
		request.setAttribute("horarios", horarios);
		String url = "/jsp/ViewListAvailableSchedule.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
}
