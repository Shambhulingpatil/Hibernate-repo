package unidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Sham s=new Sham();
		s.setPan_id(6756);
		s.setName("mallikarjun");
		s.setAddres("Karnataka");
		s.setPhone(9339746296l);
		
		Person person=new Person();
		person.setId(2);
		person.setName("mallu");
		person.setAddress("Savanur");
		person.setDob("19/03/1995");
		
		s.setPerson(person); //Mapping- connecting Shambhu class to Person class
		
		t.begin();
		m.persist(s);
		m.persist(person);
		t.commit();
		
		System.out.println("Data inserted successfully and mapping is done");
	}

}
