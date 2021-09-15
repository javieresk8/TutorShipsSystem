package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuStudentController
 */
@WebServlet("/MenuStudentController")
public class MenuStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MenuStudentController() {
        //super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		presentar(request, response);
	}

	
	protected void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewMenuStudent.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}


}
