package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;
import com.model.entidades.Department;
import com.model.entidades.Schedule;
import com.model.entidades.Teacher;

/**
 * Servlet implementation class InsertAvailableSchedule
 */
@WebServlet("/InsertAvailableSchedule")
public class InsertAvailableSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAvailableSchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request,response);
		System.out.print("Gettt!!!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date");
		String hour = request.getParameter("hour");
		 String[] parts = hour.split("-");
		String hora_inicio = parts[0]; // 123
		String hora_fin = parts[1]; // 654321
		
		Schedule sched = new Schedule();
		sched.setDia(date);
		sched.setHoraFin(hora_fin);
		sched.setHoraInicio(hora_inicio);
		Teacher t = new Teacher();
		List<Schedule> horarios = new ArrayList<Schedule>();
		horarios.add(sched);
		t.setSchedule(horarios);
		DAOFactory.getFactory().getScheduleDAO().createWithId(sched, 4);
		request.getRequestDispatcher("ListTeacherAvailableHoursController").forward(request, response);

	}
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String url = "/jsp/ViewInsertAvailableSchedule.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
