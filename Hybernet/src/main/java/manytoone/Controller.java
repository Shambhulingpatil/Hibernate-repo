package manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//ManyToOne Unidirection 
public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Users user1=new Users();
		user1.setUser_id("com.mysql.cj.jdbc.prithamsir");
		user1.setUsername("Hello");
		user1.setUaddress("Bangalore");
		user1.setPhoneno(123456788887l);
		
		Users user2=new Users();
		user2.setUser_id("com.mysql.cj.jdbc.prithamsir2");
		user2.setUsername("Hi");
		user2.setUaddress("Mangalore");
		user2.setPhoneno(987654321234l);
		
		Instagram insta=new Instagram();
		insta.setInsta_id("insta3948gh");
		insta.setInsta_id("shambhulig.gmail.com");
		insta.setProfile_name("Sham");
		insta.setPhone_no(5678976548l);
		
		
		user1.setInstagram(insta);
		user2.setInstagram(insta);
		
		//This is for ByDirection
//		List<Users> userlist=new ArrayList<Users>();
//		userlist.add(user1);
//		userlist.add(user2);
		
		t.begin();
		m.persist(user1);
		m.persist(user2);
		m.persist(insta);
		t.commit();
		
		

		
		
	}

}
