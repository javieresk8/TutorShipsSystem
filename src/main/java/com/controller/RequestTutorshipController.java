package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.dao.DAOFactory;
import com.model.entidades.Schedule;
import com.model.entidades.Student;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;
import com.model.entidades.User;

/**
 * Servlet implementation class RequestTutorshipController
 */
@WebServlet("/RequestTutorshipController")
public class RequestTutorshipController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Integer IdTeacher=4;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestTutorshipController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Schedule> sc = DAOFactory.getFactory().getTeacherDAO().getByID(IdTeacher).getSchedule();
		List<User> profesores = DAOFactory.getFactory().getUserDAO().getUsers();
		
		 List<Teacher> arrayProfesores = new ArrayList<>();
		
		for (User s : profesores) {
			
			if(s.getRol().equals("Teacher")) {
			arrayProfesores.add(new Teacher(s.getIdUsuario(), s.getNombre(),s.getApellido(),s.getCedula(),s.getRol(),s.getClave()));	
		}
		}
		
		for (Teacher u : arrayProfesores) {
				System.out.println(u.getRol() + u.getNombre());	
			}
		request.setAttribute("sc", sc);
		request.setAttribute("arrayProfesores", arrayProfesores);
		presentar(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();
		User usuario = (User) misession.getAttribute("usuario Logueado");
		Integer IdStudent = usuario.getIdUsuario();
		Student informacion = DAOFactory.getFactory().getStudentDAO().getByID(IdStudent);
		String id_teacher = request.getParameter("teacher");
		String id_date = request.getParameter("date");
		//Necesitamos tener el objeto student, schedule y teacher
		//No hace validacion si ya esta ocupada la hora
		Teacher t = DAOFactory.getFactory().getTeacherDAO().getByID(Integer.parseInt(id_teacher));
		Student s = DAOFactory.getFactory().getStudentDAO().getByID(IdStudent);
		Schedule sc = DAOFactory.getFactory().getScheduleDAO().getByID(Integer.parseInt(id_date));
		Tutorship tutoria = new Tutorship();
		tutoria.setSchedule(sc);
		tutoria.setStudent(s);
		tutoria.setTeacher(t);
		DAOFactory.getFactory().getTutorshipDAO().create(tutoria);
		String url = "ListTutorshipController";
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	protected void presentar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/jsp/ViewRequestTutorship.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
}
