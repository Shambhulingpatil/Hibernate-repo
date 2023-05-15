package Bidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Adharcard a=new Adharcard();
		a.setAdharno(123456);
		a.setName("Sharu");
		a.setAddress("Haveri");
		a.setMobno(7337289171l);
		
		Personadhar p=new Personadhar();
		p.setAdharid(1);
		p.setName("sharadi");
		p.setAddress("Haveri");
		
		a.setPersonadhar(p);
		p.setAdharcard(a);
		
		t.begin();
		m.persist(a);
		m.persist(p);
		t.commit();
		
		
		
	}

}
