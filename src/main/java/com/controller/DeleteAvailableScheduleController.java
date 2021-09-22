package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.dao.DAOFactory;



/**
 * Servlet implementation class DeleteAvailableScheduleController
 */
@WebServlet("/DeleteAvailableScheduleController")
public class DeleteAvailableScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String idSchedule;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAvailableScheduleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		idSchedule = request.getParameter("id");
		
	DAOFactory.getFactory().getScheduleDAO().deleteByID(Integer.parseInt(idSchedule));

		presentar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewListTeacherAvailableHours.jsp";				
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
