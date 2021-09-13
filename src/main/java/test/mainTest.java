package test;

import com.model.dao.DAOFactory;
import com.model.dao.GenericDAO;
import com.model.entidades.Admin;
import com.model.entidades.Student;
import com.model.entidades.User;
import com.model.jpa.JPADAOFactory;

public class mainTest {

	public static void main(String[] args) {
		User user = new User();
		user.setApellido("erazo");
		Admin ad= new Admin();
		
		
		DAOFactory.getFactory().getUserDAO().create(user);
		System.out.println("Se inserto:" + user);
	}
		

}
