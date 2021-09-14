package test;

import java.util.List;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;
import com.model.entidades.Admin;
import com.model.entidades.Department;
import com.model.entidades.Student;
import com.model.entidades.Teacher;
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
//		User ad2 = new Admin();
//		ad2.setApellido("Erazo");
//		ad2.setCedula("1234132");
//		ad2.setClave("sdf");
//		ad2.setNombre("asdf");
//		DAOFactory.getFactory().getUserDAO().create(ad2);
//		System.out.println("Se inserto:" + ad2.toString());
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
//		List<Department> deptos = DAOFactory.getFactory().getDapartmentDAO().getDepartments();
//		for(Department d: deptos) {
//			System.out.println("Id: " + d.getIdDepartment()+" Nombre: " + d.getNombreDepartamento());	
//		}
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
		
	}
		

}
