package test;

import java.util.ArrayList;
import java.util.List;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;
import com.model.entidades.Admin;
import com.model.entidades.Department;
import com.model.entidades.Schedule;
import com.model.entidades.Student;
import com.model.entidades.Teacher;
import com.model.entidades.Tutorship;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;

public class mainTest {

	public static void main(String[] args) {
		
		//EclipseLink genera toda la base de datos cuando hacemos 
		// la primera insercion de cualquier cosa 
		//
		//User user = new User();
		//user.setApellido("erazo");
		
//		//===============Caso de uso Insertar Admin***NUEVO****===============
		User ad2 = new Admin();
		ad2.setApellido("Erazo");
		ad2.setCedula("1234132");
		ad2.setClave("sdf");
		ad2.setNombre("asdf");
		DAOFactory.getFactory().getUserDAO().create(ad2);
		System.out.println("Se inserto:" + ad2.toString());
//		
//		//===============Caso de uso Insertar Student***NUEVO***===============
//		User st = new Student();
//		st.setApellido("ErazoS");
//		st.setCedula("1234132");
//		st.setClave("sdf");
//		st.setNombre("asdf");
//		DAOFactory.getFactory().getUserDAO().create(st);
//		System.out.println("Se inserto:" + st.toString());
		
//		//===============Caso de Uso Insertar Profesor***NUEVO***===============
//		Teacher teacher = new Teacher();
//		teacher.setApellido("ErazoS");
//		teacher.setCedula("123413222");
//		teacher.setClave("sdf");
//		teacher.setNombre("asdf");
//		
//		//Recuperar departamento
//		Department resultado = DAOFactory.getFactory().getDapartmentDAO().getByID(1);
//		System.out.println("Resultado:" + resultado.getNombreDepartamento());
//		//Seteo el dep en el teacher
//		teacher.setDepartamento(resultado);
//		DAOFactory.getFactory().getTeacherDAO().create(teacher);
		
//		//=============== Caso de Uso Insertar Departamento ===============
//		Department dep = new Department();
//		dep.setNombreDepartamento("RRHH");
//		DAOFactory.getFactory().getDapartmentDAO().create(dep);
		
//		
//		Department dep2 = new Department();
//		dep2.setNombreDepartamento("Contabilidad");
//		DAOFactory.getFactory().getDapartmentDAO().create(dep2);
//		
//		Department dep3 = new Department();
//		dep3.setNombreDepartamento("Administracion");
//		DAOFactory.getFactory().getDapartmentDAO().create(dep3);
		
//		//===============Caso de uso Listar Departamentos===============
	//List<Department> deptos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
		//for(Department d: deptos) {
			//System.out.println("Id: " + d.getIdDepartment()+" Nombre: " + d.getNombreDepartamento());	
		//}
//		
//		//=============== Caso de Uso Eliminar Departamento ===============
//		
//		DAOFactory.getFactory().getDapartmentDAO().deleteByID(3);
//		
//		List<Department> deptosA = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
//		for(Department d: deptosA) {
//			System.out.println("Id: " + d.getIdDepartment()+" Nombre: " + d.getNombreDepartamento());	
//		}
//		
//		//=============== Caso de Uso Actualizar Departamento ===============
//		Department dep = new Department();
//		dep.setNombreDepartamento("Limpieza");
//		dep.setIdDepartment(2); //Ingresa  el id del objeto que quieres actualizar
//		DAOFactory.getFactory().getDapartmentDAO().update(dep);
		
		
//		//===============Caso de uso Login===============
//		//Nota ERROR(false) cuando existen usarios con misma cedula y pass y rol
//		//ERROR (false) cuando no existe el registro
//		//Caso true
//		boolean resultadoAut = DAOFactory.getFactory().getUserDAO().authorize("123413222", "sdf", "Teacher");
//		System.out.println(resultadoAut);
//		
//		//Caso False 
//		boolean resultadoFal = DAOFactory.getFactory().getUserDAO().authorize("123", "sdf", "Teacher");
//		System.out.println(resultadoFal);
		
//		//===============Caso de uso Listar Usuarios===============
//		List<User> users = DAOFactory.getFactory().getUserDAO().getUsers();
//		for(User d: users) {
//			System.out.println("Id: " + d.getIdUsuario() +
//		" rol: "+ d.getRol()+ 
//		" apellido: " + d.getApellido() +
//		" cedula: " + d.getCedula() + 
//		" nombre: " + d.getNombre());	
//		}
		
//		//===============Caso de uso Eliminar Usuario===============
//		System.out.println("=========Antes del borrado==================");
//		List<User> users = DAOFactory.getFactory().getUserDAO().getUsers();
//		for(User d: users) {
//			System.out.println("Id: " + d.getIdUsuario() +
//		" rol: "+ d.getRol()+ 
//		" apellido: " + d.getApellido() +
//		" cedula: " + d.getCedula() + 
//		" nombre: " + d.getNombre());	
//		
//		}
//		DAOFactory.getFactory().getUserDAO().deleteByID(2);
//		System.out.println("=========Despues del borrado==================");
//		List<User> users2 = DAOFactory.getFactory().getUserDAO().getUsers();
//		for(User d: users2) {
//			System.out.println("Id: " + d.getIdUsuario() +
//		" rol: "+ d.getRol()+ 
//		" apellido: " + d.getApellido() +
//		" cedula: " + d.getCedula() + 
//		" nombre: " + d.getNombre());	
//		
//		}
		
		//===============Caso de uso Actualizar Usuario===============
//		User ad2 = new Admin();
//		ad2.setApellido("Cardenas");
//		ad2.setCedula("4563456");
//		ad2.setClave("abc");
//		ad2.setNombre("asdf"); 
//		ad2.setIdUsuario(2);
//		DAOFactory.getFactory().getUserDAO().update(ad2);
		
		//Actualizar un teacher
//		//ERROR: Cuando el valor de rol es nulo
//		Teacher teacher = new Teacher();
//		teacher.setApellido("Vargas");
//		teacher.setCedula("1234");
//		teacher.setClave("sdf");
//		teacher.setNombre("asdf");
//		teacher.setIdUsuario(2);
//		teacher.setRol("Teacher");
//		
//		//Recuperar departamento
//		Department resultado = DAOFactory.getFactory().getDapartmentDAO().getByID(1);
//		System.out.println("Resultado:" + resultado.getNombreDepartamento());
//		//Seteo el dep en el teacher
//		teacher.setDepartamento(resultado);
//		DAOFactory.getFactory().getUserDAO().update(teacher);
		
		
		//*********************************Profesor****************************
//		
//		//===============Caso de uso Ver Informacion del profesor===============
//		//-	El docente podrá actualizar su información personal 
//		//(nombre, apellido, departamento al que pertenece
//		Integer id = 4;
//		Teacher result = DAOFactory.getFactory().getTeacherDAO().getByID(id);
//		System.out.println("Id: " + result.getIdUsuario() +
//				" rol: "+ result.getRol()+ 
//				" apellido: " + result.getApellido() +
//				" cedula: " + result.getCedula() + 
//				" nombre: " + result.getNombre()+
//				" departamento: " + result.getDepartamento().getNombreDepartamento());
//		
		//===============Caso de uso Actualizar Informacion del profesor===============
//		//-	El docente podrá actualizar su información personal 
//		//(nombre, apellido, departamento al que pertenece
//		Teacher teacher = new Teacher();
//		teacher.setIdUsuario(7); //OJO: se debe setear el Id del usuario NO del teacher, caso contrario inserta uno nuevo
//		teacher.setRol("Teacher");		
//		teacher.setApellido("Barrera");
//		teacher.setCedula("09345123123");
//		teacher.setClave("1234");
//		teacher.setNombre("Andres");
//		//Se meustran todos los departamentos disponibles
//		List<Department> deptos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
//		for(Department d: deptos) {
//			System.out.println("Id: " + d.getIdDepartment()+" Nombre: " + d.getNombreDepartamento());	
//		}
////		//Recuperar departamento
////		Department resultado = DAOFactory.getFactory().getDapartmentDAO().getByID(1);
////		System.out.println("Resultado:" + resultado.getNombreDepartamento());
//		//Seteo el dep en el teacher
//		teacher.setDepartamento(deptos.get(2));
//		DAOFactory.getFactory().getTeacherDAO().update(teacher);
		
		//===============Caso de uso Insertar Horario Profesor===============
//		Schedule sched = new Schedule();
//		sched.setDia("12/08/2021");
//		sched.setHoraFin("15:15");
//		sched.setHoraInicio("15:00");
//		
//		Teacher t = new Teacher();
//		List<Schedule> horarios = new ArrayList<Schedule>();
//		horarios.add(sched);
//		t.setSchedule(horarios);
//		
//		DAOFactory.getFactory().getScheduleDAO().createWithId(sched, 8);
//		System.out.println("Se inserto un horario con id de profesor");
		
		//===============Caso de uso Listar Horarios Disponibles (Teacher)===============
//		Teacher t = DAOFactory.getFactory().getTeacherDAO().getByID(8);
//		List<Schedule> sch =  t.getSchedule();
//		for (Schedule schedule : sch) {
//			System.out.println("ID: " + schedule.getIdSchedule());
//		}
		
		//===============Caso de uso Actualizar Horarios Disponibles (Teacher)===============
//		//Recibimos el objeto con su ID, no necesitamos el id del teacher
//		Schedule s = new Schedule();
//		s.setIdSchedule(3);
//		s.setDia("12/6/21");
//		s.setHoraFin("14:45");
//		s.setHoraInicio("15:00");
//		DAOFactory.getFactory().getScheduleDAO().update(s);
		
		//===============Caso de uso Eliminar Horario Disponible (Teacher)===============
//		DAOFactory.getFactory().getScheduleDAO().deleteByID(1);
		
		//===============Caso de uso Listar Tutorias Registradas (Teacher)===============
		//List<Tutorship> tutorias = DAOFactory.getFactory().getTeacherDAO().getTutorshipsById(8);
		//for (Tutorship tutorship : tutorias) {
//			System.out.println("Id: " + tutorship.getIdTutorship() + "Profesor" + tutorship.getTeacher().getApellido() +
	//				" Estudiante: " + tutorship.getStudent().getApellido());
		//}
		
		
		//*********************************ESTUDIANTE****************************
		//===============Caso de uso Ver Informacion de Autenticacion (Student)===============
//		User st = DAOFactory.getFactory().getUserDAO().getByID(3); //Obligatorio debe ser User
//		System.out.println(" Id: " + st.getIdUsuario()+ " apellido: " + st.getApellido()+" clave: " + st.getClave());
//		
		//===============Caso de uso Cambiar Clave (Student)===============
//		//Debe ingresar clave antigua y validar
//		boolean bandera = DAOFactory.getFactory().getUserDAO().authorize("4563456", "nuevaClave", "Student");
//		//Ingresar la nueva clave
//		if(bandera) {
//			Student ad2 = new Student();
//			ad2.setRol("Student"); //Siempre setear el rol
//			ad2.setApellido("Cardenas");
//			ad2.setCedula("4563456");
//			ad2.setClave("nuevaClave2");
//			ad2.setNombre("asdf"); 
//			ad2.setIdUsuario(3);
//			DAOFactory.getFactory().getUserDAO().update(ad2);
//			System.out.println("La clave se actualizo correctamente");
//		} else
//			System.out.println("La clave no coincide");
		
		//===============Caso de uso Listar Tutorias (Student)===============
//		List<Tutorship> tutorias = DAOFactory.getFactory().getStudentDAO().getTutorshipsById(3);
//		for (Tutorship tutorship : tutorias) {
//			System.out.println("Id: " + tutorship.getIdTutorship() + "Profesor" + tutorship.getTeacher().getApellido() +
//					" Estudiante: " + tutorship.getStudent().getApellido());
//		}
//		
		
		//===============Caso de uso Listar Horarios disponibles del profesor (Student)===============
//		List<Schedule> sc = DAOFactory.getFactory().getTeacherDAO().getByID(8).getSchedule();
//		
//		for (Schedule s : sc) {
//			System.out.println("Id: " + s.getIdSchedule() + " Dia: " + s.getDia());	
//		}
		
		//===============Caso de uso Solicitar Tutoria (Student)===============
//		//Necesitamos tener el objeto student, schedule y teacher
//		//No hace validacion si ya esta ocupada la hora
//		Teacher t = DAOFactory.getFactory().getTeacherDAO().getByID(8);
//		Student s = DAOFactory.getFactory().getStudentDAO().getByID(3);
//		Schedule sc = DAOFactory.getFactory().getScheduleDAO().getByID(2);
//		Tutorship tutoria = new Tutorship();
//		tutoria.setSchedule(sc);
//		tutoria.setStudent(s);
//		tutoria.setTeacher(t);
//		DAOFactory.getFactory().getTutorshipDAO().create(tutoria);
		
	}
		

}
