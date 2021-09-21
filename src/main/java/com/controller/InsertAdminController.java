package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertAdminController
 */
@WebServlet("/InsertAdminController")
public class InsertAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAdminController() {
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
		String url = "/jsp/ViewInsertAdministrator.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}


}
