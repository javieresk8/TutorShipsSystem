package test;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;
import com.model.entidades.Admin;
import com.model.entidades.Student;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;

public class mainTest {

	public static void main(String[] args) {
		
		//EclipseLink genera toda la base de datos cuando hacemos 
		// la primera insercion de cualquier cosa 
		//
		//User user = new User();
		//user.setApellido("erazo");
		User ad= new Admin();
		Admin ad2 = new Admin();
		
		DAOFactory.getFactory().getUserDAO().create(ad2);
		System.out.println("Se inserto:" + ad2);
	}
		

}
